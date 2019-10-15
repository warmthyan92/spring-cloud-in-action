package com.twf.e.book.consumer.order.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.twf.e.book.order.api.facade.OrderFacade;


@FeignClient(name="e-book-order")
public interface OrderService extends OrderFacade{

}
