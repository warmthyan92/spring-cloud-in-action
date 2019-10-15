package com.twf.zuul.gateway.filter.exception.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class PostFilter extends ZuulFilter{

	private static final Logger logger = LoggerFactory.getLogger(PostFilter.class);
	
	/**
	 * 是否开启过滤器，默认为false，不开启。我们现在开启它，就设为true。
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/**
	 * 过滤器的作用
	 */
	@Override
	public Object run() {
		RequestContext rc=RequestContext.getCurrentContext();
		HttpServletRequest request=rc.getRequest();
		logger.info("---------------------------post-------------------------------");
		return null;
	}

	@Override
	public String filterType() {
		return "post";
	}

	/**
	 * 控制执行顺序
	 */
	@Override
	public int filterOrder() {
		return 0;
	}
}
