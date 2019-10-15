package com.twf.sleuth.zipkin.mq.product.api.domain;

import java.io.Serializable;

public class Product implements Serializable{
    
	private static final long serialVersionUID = -4652183855215503170L;


	private Integer id;

    
    private String name;

    
    private Integer status;

    
    private Integer price;

    
    private String detail;

    
    private Integer deleted;

    
    private String createTime;

    
    private String updateTime;

	public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    
    public Integer getStatus() {
        return status;
    }

    
    public void setStatus(Integer status) {
        this.status = status;
    }

    
    public Integer getPrice() {
        return price;
    }

    
    public void setPrice(Integer price) {
        this.price = price;
    }

    
    public String getDetail() {
        return detail;
    }

    
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    
    public Integer getDeleted() {
        return deleted;
    }

    
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    
    public String getCreateTime() {
        return createTime;
    }

    
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    
    public String getUpdateTime() {
        return updateTime;
    }

    
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    
	public Product() {
		super();
	}

	public Product(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

	public Product(Integer id, String name, Integer status, Integer price, String detail, Integer deleted,
			String createTime, String updateTime) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.price = price;
		this.detail = detail;
		this.deleted = deleted;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", status=" + status + ", price=" + price + ", detail=" + detail
				+ ", deleted=" + deleted + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
}