package com.twf.eureka.provider.controller;

import com.twf.eureka.provider.domain.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

	@RequestMapping(value="list",method=RequestMethod.GET)
	public List<Product>listProduct() {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "登山包"));
		list.add(new Product(2, "登山杖"));
		list.add(new Product(3, "冲锋衣"));
		list.add(new Product(4, "帐篷"));
		list.add(new Product(5, "睡袋"));
		return list;
	}
}
