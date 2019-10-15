package com.twf.sleuth.zipkin.mq.product.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.twf.sleuth.zipkin.mq.product.core.persistence")
public class SleuthZipkinMQProductCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthZipkinMQProductCoreApplication.class, args);
	}
}
