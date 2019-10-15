package com.twf.e.book.trader.core.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.twf.e.book.order.api.facade.OrderFacade;

@FeignClient(name="e-book-order")
public interface OrderService1 extends OrderFacade{

}
