package com.twf.e.book.consumer.hystrix.ribbon.threadpool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableCircuitBreaker  // 开启服务降级断路器
@EnableEurekaClient
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class ConsumerHystrixRibbonThreadPoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerHystrixRibbonThreadPoolApplication.class, args);
	}
}
