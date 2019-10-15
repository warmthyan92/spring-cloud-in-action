package com.twf.springboot.helloworld.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyControllerAdvice {

	/**
	 * @Author yanwl
	 * @Description 全局捕获异常类，只要作用在@RequestMapping方法上，所有的异常信息都会被捕获到。
	 * @Param
	 * @Return
	 * @Date 2019/10/14
	 **/
	@ResponseBody
	@ExceptionHandler(value=Exception.class)
	public Map<String,Object> errorHandler(Exception ex) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", -1);
		map.put("msg", ex.getMessage());
		return map;
	}
	
	@ResponseBody
	@ExceptionHandler(value=BusinessException.class)
	public Map<String,Object> errorHandler(BusinessException ex) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", ex.getCode());
		map.put("msg", ex.getMsg());
		return map;
	}
}
