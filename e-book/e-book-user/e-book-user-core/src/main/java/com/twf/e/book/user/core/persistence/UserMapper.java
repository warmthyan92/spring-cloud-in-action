package com.twf.e.book.user.core.persistence;

import org.apache.ibatis.annotations.Param;

import com.twf.e.book.user.api.domain.User;

public interface UserMapper {
    
    int deleteByPrimaryKey(Integer id);
    
    int insert(User record);
    
    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);
    
    int updateByPrimaryKey(User record);
    
    int login(@Param("userName")String userName,@Param("password")String password);
}