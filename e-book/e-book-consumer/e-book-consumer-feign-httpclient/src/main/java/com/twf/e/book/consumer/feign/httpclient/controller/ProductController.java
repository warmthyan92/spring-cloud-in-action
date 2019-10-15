package com.twf.e.book.consumer.feign.httpclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.twf.e.book.consumer.feign.httpclient.service.ProductService;
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
	
	@RequestMapping(value="get",method=RequestMethod.GET)
	public Product getProduct(@RequestParam("id")Integer id) {
		return productService.getProduct(id);
	}
	
	// 采用httpclient解决了feign自动转post的问题
	@RequestMapping(value="get2",method=RequestMethod.GET)
	public Product getProduct2(Product obj) {
		return productService.getProduct2(obj);
	}
	
	@RequestMapping(value="get3",method=RequestMethod.GET)
	public Product getProduct3(@RequestParam("id")Integer id,@RequestParam("name")String name) {
		return productService.getProduct3(id,name);
	}
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public Product addProduct() {
		Product obj = new Product(7,"水袋");
		return productService.addProduct(obj);
	}
}
