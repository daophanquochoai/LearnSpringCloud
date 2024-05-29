package com.learnmicro.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

//@FeignClient(name="currency-exchange-service", url = "localhost:8001")
@FeignClient(name="currency-exchange-service")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to
    );
}
