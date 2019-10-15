package com.twf.e.book.consumer.hystrix.feign.factory.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.twf.e.book.consumer.hystrix.feign.factory.hystrix.ProductServiceFallbackFactory;
import com.twf.e.book.product.api.domain.Product;

// 注解加了fallbackFactory，当发生服务降级情况时，将调用ProductServiceFallbackFactory类中的create方法。
@FeignClient(name="e-book-product", fallbackFactory=ProductServiceFallbackFactory.class)
public interface ProductService{
	
	@RequestMapping(value="/product/list",method=RequestMethod.GET)
	public List<Product> listProduct();
}
