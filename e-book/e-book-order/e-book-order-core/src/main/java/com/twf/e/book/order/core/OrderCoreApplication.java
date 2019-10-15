package com.twf.e.book.order.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.twf.e.book.order.core.persistence")
public class OrderCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderCoreApplication.class, args);
	}
}
