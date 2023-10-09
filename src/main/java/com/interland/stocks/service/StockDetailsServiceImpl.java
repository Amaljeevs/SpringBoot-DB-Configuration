package com.interland.stocks.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.interland.stocks.dto.StockDetailsDto;
import com.interland.stocks.entity.StockDetails;
import com.interland.stocks.exception.RecordNotFoundException;
import com.interland.stocks.repository.StockDetailsRepository;

@Service
public class StockDetailsServiceImpl implements StockDetailsService {

	@Autowired
	StockDetailsRepository stockDetailsRepository;

	@Override
	public ResponseEntity<StockDetails> addStockDetailsToDb(StockDetailsDto stockDetailsDto) {
		StockDetails stockDetailsObj = new StockDetails();
		BeanUtils.copyProperties(stockDetailsDto, stockDetailsObj);
		StockDetails savedObj = stockDetailsRepository.save(stockDetailsObj);
		return ResponseEntity.ok(savedObj);
	}

	@Override
	public ResponseEntity<StockDetails> getStockDetails(String symbol) {
		StockDetails detail = null;
		Optional<StockDetails> details = stockDetailsRepository.findById(symbol);
		if (!details.isPresent()) {
			throw new RecordNotFoundException("No Records Found!");
		}
		detail = details.get();
		return ResponseEntity.ok(detail);
	}

	@Override
	public ResponseEntity<String> deleteDetails(String symbol) {
		Optional<StockDetails> details = stockDetailsRepository.findById(symbol);
		if (!details.isPresent()) {
			throw new RecordNotFoundException("No Records Found for given symbol!");
		}
		StockDetails deleteObj = details.get();
		stockDetailsRepository.delete(deleteObj);
		return ResponseEntity.ok("Record Deleted Successfully!");
	}

}
