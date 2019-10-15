package com.twf.e.book.consumer.feign.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import feign.Logger;


@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerFeignLogApplication {

	@Bean
	public Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeignLogApplication.class, args);
	}
}
