package com.interland.stocks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Profile;

@Entity
@Table(name = "STOCK_DETAILS")
public class StockDetails {
	
	@Id
	@Column(name = "SYMBOL")
	private String symbol; 
	
	@Column(name = "SYMBOL_NAME")
	private String symbolName;
	
	@Column(name = "PRICE")
	private String price;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbolName() {
		return symbolName;
	}

	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	

}
