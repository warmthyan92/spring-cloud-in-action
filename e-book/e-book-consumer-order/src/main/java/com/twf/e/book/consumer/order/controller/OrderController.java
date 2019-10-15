package com.twf.e.book.consumer.order.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.twf.e.book.consumer.order.service.OrderService;
import com.twf.e.book.consumer.order.service.ProductService;
import com.twf.e.book.consumer.order.service.TradeService;
import com.twf.e.book.consumer.order.service.UserService;
import com.twf.e.book.order.api.domain.Order;
import com.twf.e.book.product.api.domain.Product;
import com.twf.e.book.trader.api.domain.Trader;

@RestController
public class OrderController {

	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	
	@Autowired
	private UserService userService;

	@Autowired
	private ProductService productService;

	@Autowired
	private OrderService orderService;

	@Autowired
	private TradeService tradeService;

	/**
	 * 聚合链条模式
	 * 
	 * 模拟内容： 登录 查看产品 下订单 
	 * 
	 * 1.测试登录 账号 twf 123456 
	 * 2.查看所有产品列表 
	 * 3.选第一款产品，下订单 
	 * 4.实现订单交易支付
	 * 5.查看所有的订单信息
	 * 
	 * @throws ParseException
	 */
	@RequestMapping(value = "/createOrder", method = RequestMethod.GET)
	public List<Order> createOrder()  {

		// 1.测试登录 账号 twf 123456 
		Integer userid = this.login();
		// 2.查看所有产品列表
		List<Product> products = new ArrayList<Product>();
		products = this.productService.findAllProduct();
		// 3.选第一款产品，下订单
		Product product = products.get(0);
		Order order = new Order();
		order.setUserId(userid);
		order.setProductId(product.getId());
		order.setPrice(product.getPrice());
		order.setCreateTime(df.format(new Date()));
		order.setUpdateTime(df.format(new Date()));
		Integer orderid=this.orderService.createOrder(order);
//		 4.实现订单交易支付
		Trader trade = new Trader();
		trade.setUserId(order.getUserId());
		trade.setOrderId(orderid);
		trade.setPrice(order.getPrice());
		trade.setPayType((byte)1);// 支付类型:1-支付宝支付，2-网银在线，3-银联，4-微信支付
		trade.setPayStatus((byte)4);// 1 未付款 2 付款中 3 付款失败 4 付款完成
		trade.setGatewayPayNum(String.valueOf((new Date()).getTime()));// 网关支付流水号取当前时间
		trade.setGatewayPayPrice(order.getPrice());
		trade.setGatewayPayTime(new Date());
		this.tradeService.createTrader(trade);
		// 5.查看所有的订单信息
		List<Order> orders = this.orderService.findOrderByUserId(userid);
		return orders;
	}

	private Integer login() {
		String userName = "twf";
		String password = "123456";
		Integer id = this.userService.login(userName, password);
		if (id != null) {
			System.out.println("登录成功 id=" + id);
		} else {
			System.out.println("登录失败");
		}
		return id;
	}
}
