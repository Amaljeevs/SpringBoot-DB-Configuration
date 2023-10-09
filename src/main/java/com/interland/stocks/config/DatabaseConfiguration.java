package com.interland.stocks.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {

	// Database Configuration using bean

	@Bean
	public DataSource getData() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver");
		dataSourceBuilder.url("jdbc:mysql://localhost:3307/sampleDb");
		dataSourceBuilder.username("root");
		dataSourceBuilder.password("admin");
		return dataSourceBuilder.build();
	}

}
