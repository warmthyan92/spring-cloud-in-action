package com.twf.zuul.gateway.filter.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class LogFilter extends ZuulFilter{

	private static final Logger logger = LoggerFactory.getLogger(LogFilter.class);
	
	/**
	 * 是否开启过滤器，默认为false，不开启。我们现在开启它，就设为true。
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/**
	 * 过滤器的作用，打印请求的信息
	 */
	@Override
	public Object run() {
		RequestContext rc=RequestContext.getCurrentContext();
		HttpServletRequest request=rc.getRequest();
		logger.info("method={},url={}",request.getMethod(),request.getRequestURL().toString());
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}
}
