package com.twf.e.book.trader.api.facade;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.twf.e.book.trader.api.domain.Trader;

@RequestMapping("/trader")
public interface TraderFacade {

	@RequestMapping(value = "/createTrade", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createTrader(Trader obj); 
}
