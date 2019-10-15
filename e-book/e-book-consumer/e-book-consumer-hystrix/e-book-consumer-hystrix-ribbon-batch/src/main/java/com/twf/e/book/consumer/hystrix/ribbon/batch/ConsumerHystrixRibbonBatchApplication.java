package com.twf.e.book.consumer.hystrix.ribbon.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCircuitBreaker  // 开启服务降级断路器
@EnableEurekaClient
@SpringBootApplication
public class ConsumerHystrixRibbonBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerHystrixRibbonBatchApplication.class, args);
	}
}
