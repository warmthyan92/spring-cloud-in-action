package com.twf.e.book.consumer.hystrix.ribbon.batch.controller;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.twf.e.book.consumer.hystrix.ribbon.batch.domain.Product;
import com.twf.e.book.consumer.hystrix.ribbon.batch.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value="list",method=RequestMethod.GET)
	public void getProduct() throws InterruptedException, ExecutionException {
		Future<Product> p1 = productService.getProduct(1);
		Future<Product> p2 = productService.getProduct(2);
		Future<Product> p3 = productService.getProduct(3);
		System.out.println(p1.get().toString());
		System.out.println(p2.get().toString());
		System.out.println(p3.get().toString());
	}
}
