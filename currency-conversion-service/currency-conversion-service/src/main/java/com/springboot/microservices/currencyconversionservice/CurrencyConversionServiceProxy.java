package com.springboot.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="currency-exchange-service",url="http://localhost:8000")
//@FeignClient(name="currency-exchange-service")
@FeignClient(name="netflix-zull-api-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyConversionServiceProxy {

	//@GetMapping("currency-exchange/from/{from}/to/{to}")
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean getExchangeValue(@PathVariable String from,@PathVariable String to );
}
