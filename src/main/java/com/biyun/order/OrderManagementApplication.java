package com.biyun.order;

import com.biyun.order.service.local.ConfigWatcherService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

@SpringBootApplication(scanBasePackages = {"com.biyun.order.*"})
@MapperScan("com.biyun.order.mapper")
@ConfigurationProperties
public class OrderManagementApplication implements CommandLineRunner {
	// debug日志开关，本地调试时改成true；
	private static final boolean DEBUG = true;
	@Autowired
	private ConfigWatcherService configWatcherService;

	public static void main(String[] args) {
		if (!DEBUG) {
			try (PrintStream out = new PrintStream(new FileOutputStream("app.log", true))) {
				System.setOut(out);
				System.setErr(out);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		SpringApplication.run(OrderManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		configWatcherService.startWatching();
	}
}
