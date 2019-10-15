package com.twf.e.book.consumer.order.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.twf.e.book.trader.api.facade.TraderFacade;


@FeignClient(name="e-book-trader")
public interface TradeService extends TraderFacade{

}
