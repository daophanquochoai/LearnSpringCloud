package com.learnmicro.limitsservice.bean;

public class LimitsConfiguration {
    private int maximun;
    private int minimun;
    protected LimitsConfiguration(){

    }

    public LimitsConfiguration(int maximun, int minimun) {
        super();
        this.maximun = maximun;
        this.minimun = minimun;
    }

    public int getMaximun() {
        return maximun;
    }

    public int getMinimun() {
        return minimun;
    }

//    public void setMaximun(int maximun) {
//        this.maximun = maximun;
//    }
//
//    public void setMinimun(int minimun) {
//        this.minimun = minimun;
//    }
}
