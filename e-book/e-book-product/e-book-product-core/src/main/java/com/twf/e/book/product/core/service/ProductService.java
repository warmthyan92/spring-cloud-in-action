package com.twf.e.book.product.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twf.e.book.product.api.domain.Product;
import com.twf.e.book.product.core.persistence.ProductMapper;

@Service
public class ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	public List<Product>listProduct() {
		List<Product> list = productMapper.findAllProduct();
		return list;
	}

	public Product selectByPrimaryKey(Integer id) {
		return productMapper.selectByPrimaryKey(id);
	}
}
