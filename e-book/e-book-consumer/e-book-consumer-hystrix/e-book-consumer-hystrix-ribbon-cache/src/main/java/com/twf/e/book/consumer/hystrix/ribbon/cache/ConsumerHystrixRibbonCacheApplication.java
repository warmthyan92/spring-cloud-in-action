package com.twf.e.book.consumer.hystrix.ribbon.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCaching
@EnableCircuitBreaker  // 开启服务降级断路器
@EnableEurekaClient
@SpringBootApplication
public class ConsumerHystrixRibbonCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerHystrixRibbonCacheApplication.class, args);
	}
}
