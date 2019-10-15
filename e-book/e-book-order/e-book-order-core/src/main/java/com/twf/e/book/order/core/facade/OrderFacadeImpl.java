package com.twf.e.book.order.core.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.twf.e.book.order.api.domain.Order;
import com.twf.e.book.order.api.facade.OrderFacade;
import com.twf.e.book.order.core.service.OrderService;

@RestController
public class OrderFacadeImpl implements OrderFacade{

	@Autowired
	private OrderService orderService;

	@Override
	public List<Order> findAllOrder() {
		return this.orderService.findAllOrder();
	}

	@Override
	public List<Order> findOrderByUserId(Integer userId) {
		return this.orderService.findOrderByUserId(userId);
	}

	@Override
	public Integer createOrder(@RequestBody Order order) {
		return this.orderService.createOrder(order);
	}

	@Override
	public Integer updateOrderByTrader(@RequestBody Order order) {
		return this.orderService.updateOrderByTrader(order);
	}

	@Override
	public Order findOrderById(Integer id) {
		return this.orderService.findOrderById(id);
	}
}
