package com.learnmicro.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    private int maximun;
    private int minimun;

    public void setMaximun(int maximun) {
        this.maximun = maximun;
    }

    public void setMinimun(int minimun) {
        this.minimun = minimun;
    }

    public int getMaximun() {
        return maximun;
    }

    public int getMinimun() {
        return minimun;
    }
}
