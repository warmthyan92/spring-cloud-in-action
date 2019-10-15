package com.twf.config.encrypt.symmetric.product.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.twf.config.encrypt.symmetric.product.core.persistence")
public class ConfigEncryptSymmetricProductCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigEncryptSymmetricProductCoreApplication.class, args);
	}
}
