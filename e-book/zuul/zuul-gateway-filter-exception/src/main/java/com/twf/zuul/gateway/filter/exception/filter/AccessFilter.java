package com.twf.zuul.gateway.filter.exception.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class AccessFilter extends ZuulFilter{

	private static final Logger logger = LoggerFactory.getLogger(AccessFilter.class);
	
	/**
	 * 是否开启过滤器，默认为false，不开启。我们现在开启它，就设为true。
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/**
	 * 过滤器的作用，权限校验
	 */
	@Override
	public Object run() {
		RequestContext rc=RequestContext.getCurrentContext();
		HttpServletRequest request=rc.getRequest();
		logger.info("---------------------------pre1-------------------------------");
		String token = request.getParameter("token");
		if (token == null) {
			logger.warn("token is  null...............");
			rc.setSendZuulResponse(false); // false代表结束请求，不再继续下级传递
			rc.setResponseStatusCode(401);
			rc.setResponseBody("{\"result\":\"token is null\"}");
			rc.getResponse().setContentType("text/html;charset=utf-8");
		} else {
			logger.info("token is ok");
			
		}
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	/**
	 * 控制执行顺序
	 */
	@Override
	public int filterOrder() {
		return 0;
	}
}
