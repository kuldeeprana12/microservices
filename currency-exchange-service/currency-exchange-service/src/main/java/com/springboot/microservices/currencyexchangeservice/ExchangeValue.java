package com.springboot.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	private int id;
	@Column(name="Currency_from")
	private String from;
	@Column(name="Currency_to")
	private String to;
	private BigDecimal exchangeValue;
	private int port;
	
	public ExchangeValue() {
		
	}
	public ExchangeValue(int id, String from, String to, BigDecimal exchangeValue) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeValue = exchangeValue;
	}
	
	public int getId() {
		return id;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public BigDecimal getExchangeValue() {
		return exchangeValue;
	}
	public int getPort() {
		return port;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public void setExchangeValue(BigDecimal exchangeValue) {
		this.exchangeValue = exchangeValue;
	}
	public void setPort(int port) {
		this.port = port;
	}
}
