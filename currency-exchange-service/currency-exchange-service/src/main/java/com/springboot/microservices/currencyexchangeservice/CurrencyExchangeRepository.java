package com.springboot.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Integer> {
	
	ExchangeValue findByFromAndTo(String from, String to);

}
