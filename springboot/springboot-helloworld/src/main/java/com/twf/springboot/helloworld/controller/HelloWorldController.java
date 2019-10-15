package com.twf.springboot.helloworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private final static Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	@Value("${twf.param3}")
	private String msg;
	
	@RequestMapping("/hello")
	public String index() {
		logger.info("hello的日志输出!" + this.msg);
		return this.msg;
	}
}
