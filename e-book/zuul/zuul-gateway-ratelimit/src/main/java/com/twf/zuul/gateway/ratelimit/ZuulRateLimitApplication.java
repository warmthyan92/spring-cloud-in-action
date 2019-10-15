package com.twf.zuul.gateway.ratelimit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulRateLimitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulRateLimitApplication.class, args);
	}
}
