package com.twf.e.book.user.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.twf.e.book.user.core.persistence")
public class UserCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCoreApplication.class, args);
	}
}
