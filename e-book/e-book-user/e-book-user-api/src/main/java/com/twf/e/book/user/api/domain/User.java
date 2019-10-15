package com.twf.e.book.user.api.domain;

import java.io.Serializable;

public class User implements Serializable{
    
	private static final long serialVersionUID = -6289740668614837999L;


	private Integer id;

    
    private String userName;

    
    private String password;

    
    private String email;

    
    private Integer deleted;

    
    private String createTime;

    
    private String updateTime;

    
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getUserName() {
        return userName;
    }

    
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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
}