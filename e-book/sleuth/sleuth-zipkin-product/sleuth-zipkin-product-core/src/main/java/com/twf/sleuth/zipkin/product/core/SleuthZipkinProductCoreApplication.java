package com.twf.sleuth.zipkin.product.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.twf.sleuth.zipkin.product.core.persistence")
public class SleuthZipkinProductCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthZipkinProductCoreApplication.class, args);
	}
}
