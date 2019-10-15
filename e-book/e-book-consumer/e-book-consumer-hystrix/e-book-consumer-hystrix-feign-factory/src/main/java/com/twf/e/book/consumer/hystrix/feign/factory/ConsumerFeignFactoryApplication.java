package com.twf.e.book.consumer.hystrix.feign.factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerFeignFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeignFactoryApplication.class, args);
	}
}
