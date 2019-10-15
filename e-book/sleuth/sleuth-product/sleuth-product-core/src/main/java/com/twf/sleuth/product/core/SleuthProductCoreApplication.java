package com.twf.sleuth.product.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.twf.sleuth.product.core.persistence")
public class SleuthProductCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthProductCoreApplication.class, args);
	}
}
