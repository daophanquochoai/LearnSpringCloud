package com.learnmicro.currenceconversionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
@Configuration(proxyBeanMethods = false)
class RestTemplateConfiguration {
    @Bean
    RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
@RestController
public class CurrencyConversionController {
    @Autowired
    private CurrencyExchangeProxy proxy;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversion(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable BigDecimal quantity
            ){
        HashMap<String, String> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);
        ResponseEntity<CurrencyConversion> currency = restTemplate.getForEntity(
                "http://localhost:8000/currency-exchange/from/{from}/to/{to}",
                CurrencyConversion.class,
                uriVariables);
        CurrencyConversion currencyConversion = currency.getBody();
        return new CurrencyConversion(
                currencyConversion.getId(),
                currencyConversion.getFrom(),
                currencyConversion.getTo(),
                quantity,
                currencyConversion.getConversionsMultiple(),
                quantity.multiply(currencyConversion.getConversionsMultiple()),
                currencyConversion.getEnviroment());
    }


    @GetMapping("currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversionFrign(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable BigDecimal quantity
    ){

        CurrencyConversion currencyConversion = proxy.retrieveCurrencyExchange(from, to);

        return new CurrencyConversion(
                currencyConversion.getId(),
                currencyConversion.getFrom(),
                currencyConversion.getTo(),
                quantity,
                currencyConversion.getConversionsMultiple(),
                quantity.multiply(currencyConversion.getConversionsMultiple()),
                currencyConversion.getEnviroment());
    }
}
