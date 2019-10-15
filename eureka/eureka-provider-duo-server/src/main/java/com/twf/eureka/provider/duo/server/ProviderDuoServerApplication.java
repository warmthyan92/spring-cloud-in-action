package com.twf.eureka.provider.duo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProviderDuoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderDuoServerApplication.class, args);
	}
}
