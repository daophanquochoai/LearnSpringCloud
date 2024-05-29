package com.learnmicro.curremcyexchangeservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
@Entity
public class CurrencyExchange {
    @Id
    private Long id;
    @Column(name = "currency_from")
    private String from;
    @Column(name = "currency_to")
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
