package com.twf.e.book.consumer.hystrix.feign.fallback.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.twf.e.book.consumer.hystrix.feign.fallback.hystrix.ProductServiceFallback;
import com.twf.e.book.product.api.domain.Product;

// 注解加了fallback，当发生服务降级情况时，将自动调用ProductServiceFallback类中的方法。
@FeignClient(name="e-book-product", fallback=ProductServiceFallback.class)
public interface ProductService{
	
	@RequestMapping(value="/product/list",method=RequestMethod.GET)
	public List<Product> listProduct();
}
