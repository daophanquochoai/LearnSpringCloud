package com.learnmicro.currenceconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

//@FeignClient(value = "curremcy-exchange-service", url = "localhost:8000")
@FeignClient(value = "curremcy-exchange-service")
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion retrieveCurrencyExchange(
            @PathVariable String from,
            @PathVariable String to
    );
}
