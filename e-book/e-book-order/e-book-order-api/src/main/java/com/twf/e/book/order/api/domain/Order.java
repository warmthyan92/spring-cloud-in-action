package com.twf.e.book.order.api.domain;

import java.io.Serializable;

public class Order implements Serializable{
    
	private static final long serialVersionUID = -3016904599746083191L;


	private Integer id;

    
    private Integer productId;

    
    private Integer price;

    
    private Integer userId;

    
    private Integer tradeId;

    
    private Integer tradeStatus;

    
    private Integer deleted;

    
    private String createTime;

    
    private String updateTime;

    
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public Integer getProductId() {
        return productId;
    }

    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    
    public Integer getPrice() {
        return price;
    }

    
    public void setPrice(Integer price) {
        this.price = price;
    }

    
    public Integer getUserId() {
        return userId;
    }

    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    public Integer getTradeId() {
        return tradeId;
    }

    
    public void setTradeId(Integer tradeId) {
        this.tradeId = tradeId;
    }

    
    public Integer getTradeStatus() {
        return tradeStatus;
    }

    
    public void setTradeStatus(Integer tradeStatus) {
        this.tradeStatus = tradeStatus;
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
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

	public Order() {
		super();
	}

	public Order(Integer id, Integer productId, Integer price, Integer userId, Integer tradeId, Integer tradeStatus,
			Integer deleted, String createTime, String updateTime) {
		super();
		this.id = id;
		this.productId = productId;
		this.price = price;
		this.userId = userId;
		this.tradeId = tradeId;
		this.tradeStatus = tradeStatus;
		this.deleted = deleted;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", productId=" + productId + ", price=" + price + ", userId=" + userId + ", tradeId="
				+ tradeId + ", tradeStatus=" + tradeStatus + ", deleted=" + deleted + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}
}