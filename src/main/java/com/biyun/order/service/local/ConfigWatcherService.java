package com.biyun.order.service.local;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
@Slf4j
public class ConfigWatcherService implements ApplicationListener<ContextRefreshedEvent> {
    private static final Logger logger = LoggerFactory.getLogger(ConfigWatcherService.class);
    private final Path dirToWatch;
    private final WatchService watchService;
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    @Autowired
    private ConfigFactory factory;

    @Autowired
    public ConfigWatcherService(WatcherConfig watcherConfig) throws IOException {
        this.watchService = FileSystems.getDefault().newWatchService();
        this.dirToWatch = Paths.get(watcherConfig.getDirectory()).toAbsolutePath().normalize();
//        try {
//            Files.newDirectoryStream(dirToWatch).forEach(path -> reloadConfiguration(path));
//        } catch (IOException e) {
//            log.error(e.getMessage(), e);
//        }
        // 注册感兴趣的事件：ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE
        dirToWatch.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
        logger.info("Watcher service started");
    }

    public void startWatching() throws IOException, InterruptedException {
        executorService.submit(() -> {
            // 开始循环监听事件
            while (true) {
                WatchKey key;
                try {
                    key = watchService.take();
                } catch (InterruptedException e) {
                    return;
                }

                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();

                    @SuppressWarnings("unchecked")
                    WatchEvent<Path> ev = (WatchEvent<Path>) event;
                    Path fileName = ev.context();

                    System.out.println(kind.name() + ": " + fileName);

                    // 根据事件类型执行相应操作，比如重新加载配置
                    if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
                        System.out.println("监听到文件修改事件，重新加载文件内容");
                        try {
                            reloadConfiguration(fileName);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }

                boolean valid = key.reset();
                if (!valid) {
                    break;
                }
            }
        });
    }


    private void reloadConfiguration(Path file) throws IOException {
        Path path = dirToWatch.resolve(file);
        if (!Files.exists(path) || !Files.isRegularFile(path)) {
            return;
        }
        ConfigHandler handler = factory.get(path.getFileName().toString());
        if (null != handler) {
            handler.handle(new String(Files.readAllBytes(path)));
            // 在这里实现你的配置重载逻辑
            System.out.println("重新加载配置文件：" + path.getFileName());
        }
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {
            Files.newDirectoryStream(dirToWatch).forEach(path -> {
                try {
                    reloadConfiguration(path);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
}
