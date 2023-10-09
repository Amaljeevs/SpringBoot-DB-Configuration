package com.interland.stocks.service;

import org.springframework.http.ResponseEntity;

import com.interland.stocks.dto.StockDetailsDto;
import com.interland.stocks.entity.StockDetails;

public interface StockDetailsService {

	ResponseEntity<StockDetails> addStockDetailsToDb(StockDetailsDto stockDetailsDto);

	ResponseEntity<StockDetails> getStockDetails(String symbol);

	ResponseEntity<String> deleteDetails(String symbol);


}
