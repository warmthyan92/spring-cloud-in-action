package com.twf.e.book.consumer.hystrix.feign.fallback.hystrix;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.twf.e.book.consumer.hystrix.feign.fallback.service.ProductService;
import com.twf.e.book.product.api.domain.Product;

@Component
public class ProductServiceFallback implements ProductService{

	@Override
	public List<Product> listProduct() {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(-1, "fallback"));
		return list;
	}
}
