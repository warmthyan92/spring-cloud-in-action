package com.twf.e.book.trader.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twf.e.book.trader.api.domain.Trader;
import com.twf.e.book.trader.core.persistence.TraderMapper;

@Service
public class TraderService {

	@Autowired
	private TraderMapper traderMapper;

	public List<Trader> findAllTrader() {
		return traderMapper.selectAllTrader();
	}

	public int createTrader(Trader trader) {
		return traderMapper.insert(trader);
	}
}
