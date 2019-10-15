package com.twf.e.book.order.core.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.twf.e.book.order.api.domain.Order;

@Mapper
public interface OrderMapper {
    
    int deleteByPrimaryKey(Integer id);
    
    int insert(Order record);
    
    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

	List<Order> selectAllOrder();

	List<Order> findOrderByUserId(Integer userId);
}