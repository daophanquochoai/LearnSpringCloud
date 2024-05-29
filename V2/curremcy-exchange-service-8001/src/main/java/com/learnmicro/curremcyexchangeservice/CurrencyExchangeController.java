package com.learnmicro.curremcyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {
    @Autowired
    private Environment environment;
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveCurrencyExchange(
            @PathVariable String from,
            @PathVariable String to
    ){
        CurrencyExchange currencyExchange = new CurrencyExchange(1000L, "USA", "IRE", BigDecimal.valueOf(65));
        currencyExchange.setEnviroment(environment.getProperty("local.server.port"));
        return currencyExchange;
    }
}
