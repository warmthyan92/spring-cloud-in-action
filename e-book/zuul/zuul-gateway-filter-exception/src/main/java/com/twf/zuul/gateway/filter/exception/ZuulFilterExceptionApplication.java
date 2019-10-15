package com.twf.zuul.gateway.filter.exception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulFilterExceptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulFilterExceptionApplication.class, args);
	}
}
