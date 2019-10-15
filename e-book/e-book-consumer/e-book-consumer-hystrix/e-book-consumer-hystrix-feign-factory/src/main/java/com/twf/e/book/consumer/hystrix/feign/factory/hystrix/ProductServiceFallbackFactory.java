package com.twf.e.book.consumer.hystrix.feign.factory.hystrix;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.twf.e.book.consumer.hystrix.feign.factory.service.ProductService;
import com.twf.e.book.product.api.domain.Product;

import feign.hystrix.FallbackFactory;

@Component
public class ProductServiceFallbackFactory implements FallbackFactory<ProductService>{

	// 加入日志打印
	private Logger logger = LoggerFactory.getLogger(ProductServiceFallbackFactory.class);
	
	@Override
	public ProductService create(final Throwable arg0) {
		return new ProductService() {
			
			@Override
			public List<Product> listProduct() {
				logger.warn("fallback exception：", arg0); // 记录服务降级后的异常原因
				List<Product> list = new ArrayList<Product>();
				list.add(new Product(-1, "fallback"));
				return list;
			}
		};
	}
}
