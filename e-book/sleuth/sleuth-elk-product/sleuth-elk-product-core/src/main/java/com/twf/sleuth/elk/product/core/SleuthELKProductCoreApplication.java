package com.twf.sleuth.elk.product.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.twf.sleuth.elk.product.core.persistence")
public class SleuthELKProductCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthELKProductCoreApplication.class, args);
	}
}
