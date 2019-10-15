package com.twf.config.server.encrypt.symmetric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerEncryptSymmetricApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerEncryptSymmetricApplication.class, args);
	}
}
