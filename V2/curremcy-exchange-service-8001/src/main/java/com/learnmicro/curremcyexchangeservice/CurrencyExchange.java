package com.learnmicro.curremcyexchangeservice;

import java.math.BigDecimal;

public class CurrencyExchange {
    private Long id;
    private String from;
    private String to;
    private BigDecimal ConversionsMultiple;
    private String enviroment;

    public String getEnviroment() {
        return enviroment;
    }

    public void setEnviroment(String enviroment) {
        this.enviroment = enviroment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionsMultiple() {
        return ConversionsMultiple;
    }

    public void setConversionsMultiple(BigDecimal conversionsMultiple) {
        ConversionsMultiple = conversionsMultiple;
    }

    public CurrencyExchange() {
    }

    public CurrencyExchange(Long id, String from, String to, BigDecimal conversionsMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        ConversionsMultiple = conversionsMultiple;
    }
}
