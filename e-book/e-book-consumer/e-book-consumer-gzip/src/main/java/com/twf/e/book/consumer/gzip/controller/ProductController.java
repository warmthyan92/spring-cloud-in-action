package com.twf.e.book.consumer.gzip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.twf.e.book.consumer.gzip.service.ProductService;
import com.twf.e.book.product.api.domain.Product;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value="list",method=RequestMethod.GET)
	public List<Product>listProduct() {
		List<Product> list = productService.listProduct();
		return list;
	}
}
