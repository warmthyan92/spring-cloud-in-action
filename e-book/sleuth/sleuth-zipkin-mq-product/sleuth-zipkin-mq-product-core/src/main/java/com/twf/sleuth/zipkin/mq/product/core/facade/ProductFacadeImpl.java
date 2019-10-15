package com.twf.sleuth.zipkin.mq.product.core.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.twf.sleuth.zipkin.mq.product.api.domain.Product;
import com.twf.sleuth.zipkin.mq.product.api.facade.ProductFacade;
import com.twf.sleuth.zipkin.mq.product.core.service.ProductService;

@RestController
public class ProductFacadeImpl implements ProductFacade{

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="findAllProduct",method=RequestMethod.GET)
	public List<Product>findAllProduct() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<Product> list = new ArrayList<Product>();
		list = this.productService.listProduct();
		return list;
	}
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	public List<Product>listProduct() {
		List<Product> list = this.productService.listProduct();
		return list;
	}

	@Override
	public Product getProduct(Integer id) {
		return productService.selectByPrimaryKey(id);
	}

	@Override
	public Product getProduct2(@RequestBody Product obj) {
		return obj;
	}

	@Override
	public Product getProduct3(Integer id, String name) {
		return new Product(id,name);
	}

	@Override
	public Product addProduct(@RequestBody Product obj) {
		return obj;
	}
}
