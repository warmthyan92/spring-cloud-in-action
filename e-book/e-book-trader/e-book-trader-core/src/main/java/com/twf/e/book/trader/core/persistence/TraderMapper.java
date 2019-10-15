package com.twf.e.book.trader.core.persistence;

import java.util.List;

import com.twf.e.book.trader.api.domain.Trader;

public interface TraderMapper {
    
    int deleteByPrimaryKey(Integer id);
    
    int insert(Trader record);

    int insertSelective(Trader record);

    Trader selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Trader record);
    
    int updateByPrimaryKey(Trader record);

	List<Trader> selectAllTrader();
}