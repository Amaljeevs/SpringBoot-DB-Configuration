package com.interland.stocks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.interland.stocks.dto.StockDetailsDto;
import com.interland.stocks.entity.StockDetails;
import com.interland.stocks.service.StockDetailsService;

@RestController
@RequestMapping("/stocks")
public class StockDetailsController {

	@Autowired
	StockDetailsService stockDetailsService;

	// Adding StockDetails to DB
	@PostMapping("/add")
	private ResponseEntity<StockDetails> addDetails(@RequestBody StockDetailsDto stockDetailsDto) {
		return stockDetailsService.addStockDetailsToDb(stockDetailsDto);
	}

	// getting StockDetails using pathVariable
	@GetMapping("/getStockDetails/{symbol}")
	private ResponseEntity<StockDetails> getStockDetails(@PathVariable String symbol) {
		return stockDetailsService.getStockDetails(symbol);
	}

	// getting StockDetails using requestParam
	@GetMapping("/getStockDetails")
	private ResponseEntity<StockDetails> getStockDetailsUsingParams(@RequestParam("symbol") String symbol) {
		return stockDetailsService.getStockDetails(symbol);
	}

	// Delete stockDetails From DB using PathVariable
	@DeleteMapping("/deleteStockDetails")
	private ResponseEntity<String> deleteStockDetails(@PathVariable String symbol) {
		return stockDetailsService.deleteDetails(symbol);
	}

	// Delete stockDetails From DB using requestParam
	@DeleteMapping("/deleteStockDetailsUsingParams")
	private ResponseEntity<String> deleteStockDetailsUsingParams(@RequestParam("symbol") String symbol) {
		return stockDetailsService.deleteDetails(symbol);
	}

}
