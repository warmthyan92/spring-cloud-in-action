package com.twf.e.book.trader.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.twf.e.book.trader.core.persistence")
public class TraderCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraderCoreApplication.class, args);
	}
}
