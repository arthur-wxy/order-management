package com.biyun.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

@SpringBootApplication(scanBasePackages = {"com.biyun.order.*"})
@MapperScan("com.biyun.order.mapper")
public class OrderManagementApplication {

	public static void main(String[] args) {
		try (PrintStream out = new PrintStream(new FileOutputStream("app.log", true))) {
			System.setOut(out);
			System.setErr(out);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SpringApplication.run(OrderManagementApplication.class, args);
	}
}
