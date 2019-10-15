package com.twf.e.book.consumer.hystrix.ribbon.cache.domain;

import java.io.Serializable;

public class Product implements Serializable{

	private static final long serialVersionUID = -4778189561317447216L;
	
	private int id;
	private String name;
	
	public Product() {
		super();
	}
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
}
