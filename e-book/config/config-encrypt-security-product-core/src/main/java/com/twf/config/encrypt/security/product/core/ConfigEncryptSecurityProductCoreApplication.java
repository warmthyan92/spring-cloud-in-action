package com.twf.config.encrypt.security.product.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.twf.config.encrypt.security.product.core.persistence")
public class ConfigEncryptSecurityProductCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigEncryptSecurityProductCoreApplication.class, args);
	}
}
