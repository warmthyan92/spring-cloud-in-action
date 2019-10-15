package com.twf.e.book.trader.core.facade;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.twf.e.book.order.api.domain.Order;
import com.twf.e.book.trader.api.domain.Trader;
import com.twf.e.book.trader.api.facade.TraderFacade;
import com.twf.e.book.trader.core.service.OrderService1;
import com.twf.e.book.trader.core.service.TraderService;

@RestController
public class TraderFacadeImpl implements TraderFacade{

	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	
	@Autowired
	private TraderService traderService;
	
	@Autowired
	private OrderService1 orderService1;


	@Override
	public void createTrader(@RequestBody Trader trader) {
		trader.setCreateTime(df.format(new Date()));
		trader.setUpdateTime(new Date());
		this.traderService.createTrader(trader);
		
		//回填 订单里面的交易号
		Order order=this.orderService1.findOrderById(trader.getOrderId());
		order.setTradeId(order.getId());
		order.setTradeStatus(1);
		this.orderService1.updateOrderByTrader(order);
	}
}
