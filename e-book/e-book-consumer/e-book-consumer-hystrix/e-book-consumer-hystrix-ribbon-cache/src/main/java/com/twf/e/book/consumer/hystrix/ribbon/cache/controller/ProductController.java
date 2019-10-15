package com.twf.e.book.consumer.hystrix.ribbon.cache.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.twf.e.book.consumer.hystrix.ribbon.cache.domain.Product;
import com.twf.e.book.consumer.hystrix.ribbon.cache.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value="list",method=RequestMethod.GET)
	public List<Product>listProduct() {
		List<Product> list = productService.listProduct();
		return list;
	}
	
	@RequestMapping(value="get",method=RequestMethod.GET)
	public Product get(Integer id) {
		return this.productService.get(id);
	}
	
	@RequestMapping(value="del",method=RequestMethod.GET)
	public void del(Integer id) {
		this.productService.del(id);
	}
}
