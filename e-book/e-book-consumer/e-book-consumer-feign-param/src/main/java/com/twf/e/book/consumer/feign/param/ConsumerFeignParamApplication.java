package com.twf.e.book.consumer.feign.param;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerFeignParamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeignParamApplication.class, args);
	}
}
