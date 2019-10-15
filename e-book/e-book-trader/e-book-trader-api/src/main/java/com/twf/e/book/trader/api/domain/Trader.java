package com.twf.e.book.trader.api.domain;

import java.io.Serializable;
import java.util.Date;

public class Trader implements Serializable{
 
	private static final long serialVersionUID = -7298682975688798251L;

	
    private Integer id;

    
    private Integer orderId;

    
    private Integer userId;

    
    private Integer price;

    
    private Byte payStatus;

    
    private Byte payType;

    
    private String gatewayPayNum;

    
    private Date gatewayPayTime;

    
    private Integer gatewayPayPrice;

    
    private Byte deleted;

    
    private String createTime;

    
    private Date updateTime;

    
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public Integer getOrderId() {
        return orderId;
    }

    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    
    public Integer getUserId() {
        return userId;
    }

    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    public Integer getPrice() {
        return price;
    }

    
    public void setPrice(Integer price) {
        this.price = price;
    }

    
    public Byte getPayStatus() {
        return payStatus;
    }

    
    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    
    public Byte getPayType() {
        return payType;
    }

    
    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    
    public String getGatewayPayNum() {
        return gatewayPayNum;
    }

    
    public void setGatewayPayNum(String gatewayPayNum) {
        this.gatewayPayNum = gatewayPayNum == null ? null : gatewayPayNum.trim();
    }

    
    public Date getGatewayPayTime() {
        return gatewayPayTime;
    }

    
    public void setGatewayPayTime(Date gatewayPayTime) {
        this.gatewayPayTime = gatewayPayTime;
    }

    
    public Integer getGatewayPayPrice() {
        return gatewayPayPrice;
    }

    
    public void setGatewayPayPrice(Integer gatewayPayPrice) {
        this.gatewayPayPrice = gatewayPayPrice;
    }

    
    public Byte getDeleted() {
        return deleted;
    }

    
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    
    public String getCreateTime() {
        return createTime;
    }

    
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    
    public Date getUpdateTime() {
        return updateTime;
    }

    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


	@Override
	public String toString() {
		return "Trader [id=" + id + ", orderId=" + orderId + ", userId=" + userId + ", price=" + price + ", payStatus="
				+ payStatus + ", payType=" + payType + ", gatewayPayNum=" + gatewayPayNum + ", gatewayPayTime="
				+ gatewayPayTime + ", gatewayPayPrice=" + gatewayPayPrice + ", deleted=" + deleted + ", createTime="
				+ createTime + ", updateTime=" + updateTime + "]";
	}
}