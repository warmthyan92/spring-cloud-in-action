package com.twf.e.book.consumer.hystrix.ribbon.fallback.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.conf.HystrixPropertiesManager;
import com.twf.e.book.consumer.hystrix.ribbon.fallback.domain.Product;

@Service
public class ProductService {
	
	@Autowired
	private LoadBalancerClient loadBalancerClient; // ribbon的负载均衡客户端

	// @HystrixCommand这个注解指定了fallbackMethod为fallback。
	@HystrixCommand(fallbackMethod="fallback",commandProperties={
			@HystrixProperty(name=HystrixPropertiesManager.FALLBACK_ISOLATION_SEMAPHORE_MAX_CONCURRENT_REQUESTS,value="15")
	})
	public List<Product> listProduct() {
		ServiceInstance si = loadBalancerClient.choose("e-book-product");
		StringBuffer sb = new StringBuffer("");
		sb.append("http://");
		sb.append(si.getHost());
		sb.append(":");
		sb.append(si.getPort());
		sb.append("/product/list");
		System.out.println(sb.toString());
		
		RestTemplate restTemplate = new RestTemplate();
		ParameterizedTypeReference<List<Product>> typeRef = new ParameterizedTypeReference<List<Product>>(){};
		ResponseEntity<List<Product>> resp = restTemplate.exchange(sb.toString(), HttpMethod.GET, null, typeRef);
		List<Product> plist = resp.getBody();		
		return plist;
	}
	
	// 当调用远程服务出现异常的时候，会调用这个方法
	public List<Product> fallback() {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(-1,"fallback"));
		return list;
	}
}
