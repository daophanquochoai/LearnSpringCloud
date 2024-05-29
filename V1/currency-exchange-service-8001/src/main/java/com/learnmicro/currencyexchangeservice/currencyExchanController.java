package com.learnmicro.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class currencyExchanController {
    private final ExchangeValueRepo exchangeValueRepo;
    private Environment environment;

    public currencyExchanController(ExchangeValueRepo exchangeValueRepo, Environment environment) {
        this.exchangeValueRepo = exchangeValueRepo;
        this.environment = environment;
    }

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(
            @PathVariable String from ,
            @PathVariable String to
                    ){
            ExchangeValue ex =  exchangeValueRepo.findByFromAndTo(from, to);
            ex.setPort(Integer.valueOf(environment.getProperty("local.server.port")));
            return ex;
    }
}
