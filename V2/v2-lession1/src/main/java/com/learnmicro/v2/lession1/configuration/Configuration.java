package com.learnmicro.v2.lession1.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    private int minimum;
    private int maximum;

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimun) {
        this.minimum = minimun;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximun) {
        this.maximum = maximun;
    }
}
