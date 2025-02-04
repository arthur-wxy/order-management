package com.biyun.order.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.*;

@Service
public class ConfigWatcherService {
    private final Path dirToWatch;

    public ConfigWatcherService(@Value("${local.config.dir}") String dirPath) {
        this.dirToWatch = Paths.get(dirPath);
    }

    public void startWatching() throws IOException, InterruptedException {
        // 创建一个WatchService对象
        WatchService watchService = FileSystems.getDefault().newWatchService();

        // 注册感兴趣的事件：ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE
        dirToWatch.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);

        System.out.println("开始监听目录：" + dirToWatch);

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
                    reloadConfiguration(fileName.toString());
                }
            }

            boolean valid = key.reset();
            if (!valid) {
                break;
            }
        }
    }

    private void reloadConfiguration(String fileName) {
        // 在这里实现你的配置重载逻辑
        System.out.println("重新加载配置文件：" + fileName);
    }
}
