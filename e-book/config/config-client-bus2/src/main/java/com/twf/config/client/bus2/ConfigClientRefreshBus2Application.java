package com.twf.config.client.bus2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientRefreshBus2Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientRefreshBus2Application.class, args);
	}
}
