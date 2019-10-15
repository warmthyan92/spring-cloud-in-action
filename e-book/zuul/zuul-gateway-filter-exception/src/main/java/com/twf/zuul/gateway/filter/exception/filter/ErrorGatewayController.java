package com.twf.zuul.gateway.filter.exception.filter;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 异常的统一捕获类
 * @author twf
 *
 */
@RestController
public class ErrorGatewayController implements ErrorController{

	@Override
	public String getErrorPath() {
		return "/error";
	}
	
	@RequestMapping("/error")
	public String error() {
		return "{\"result\":\"500 error!!!\"}";
	}
}
