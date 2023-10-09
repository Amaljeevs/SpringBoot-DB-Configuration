package com.interland.stocks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interland.stocks.entity.StockDetails;

public interface StockDetailsRepository extends JpaRepository<StockDetails, String> {

}
