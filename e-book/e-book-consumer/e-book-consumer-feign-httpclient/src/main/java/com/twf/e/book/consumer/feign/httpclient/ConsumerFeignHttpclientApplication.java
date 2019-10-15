package com.twf.e.book.consumer.feign.httpclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerFeignHttpclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeignHttpclientApplication.class, args);
	}
}