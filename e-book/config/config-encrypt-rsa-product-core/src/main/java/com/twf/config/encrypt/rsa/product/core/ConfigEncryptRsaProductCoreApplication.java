package com.twf.config.encrypt.rsa.product.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.twf.config.encrypt.rsa.product.core.persistence")
public class ConfigEncryptRsaProductCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigEncryptRsaProductCoreApplication.class, args);
	}
}
