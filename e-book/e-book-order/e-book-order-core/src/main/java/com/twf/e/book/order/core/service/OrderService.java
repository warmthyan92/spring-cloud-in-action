package com.twf.e.book.order.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twf.e.book.order.api.domain.Order;
import com.twf.e.book.order.core.persistence.OrderMapper;

@Service
public class OrderService {

	@Autowired
	private OrderMapper orderMapper;

	public List<Order> findAllOrder() {
		return orderMapper.selectAllOrder();
	}

	public List<Order> findOrderByUserId(Integer userId) {
		return this.orderMapper.findOrderByUserId(userId);
	}

	public Integer createOrder(Order order) {
		this.orderMapper.insert(order);
		return order.getId();
	}

	public Integer updateOrderByTrader(Order order) {
		return this.orderMapper.updateByPrimaryKey(order);
	}

	public Order findOrderById(Integer id) {
		return this.orderMapper.selectByPrimaryKey(id);
	}
}
