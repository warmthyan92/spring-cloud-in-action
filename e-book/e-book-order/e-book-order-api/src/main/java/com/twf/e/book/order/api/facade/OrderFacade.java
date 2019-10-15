package com.twf.e.book.order.api.facade;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.twf.e.book.order.api.domain.Order;

@RequestMapping("/order")
public interface OrderFacade {

	@RequestMapping(value="findAllOrder",method=RequestMethod.GET)
	public List<Order>findAllOrder();
	
	@RequestMapping(value="findOrderByUserId",method=RequestMethod.GET)
	public List<Order> findOrderByUserId(@RequestParam("userId") Integer userId);
	
	@RequestMapping(value="createOrder",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Integer createOrder(@RequestBody Order order);
	
	@RequestMapping(value="updateOrderByTrader",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Integer updateOrderByTrader(@RequestBody Order order);
	
	@RequestMapping(value="findOrderById",method=RequestMethod.GET)
	public Order findOrderById(@RequestParam("id") Integer id);
}
