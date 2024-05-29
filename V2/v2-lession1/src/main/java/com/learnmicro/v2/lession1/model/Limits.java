package com.learnmicro.v2.lession1.model;

public class Limits {
    private int minimax;
    private int maximun;

    public Limits() {
    }

    public Limits(int minimax, int maximun) {
        this.minimax = minimax;
        this.maximun = maximun;
    }

    public int getMinimax() {
        return minimax;
    }

    public void setMinimax(int minimax) {
        this.minimax = minimax;
    }

    public int getMaximun() {
        return maximun;
    }

    public void setMaximun(int maximun) {
        this.maximun = maximun;
    }
}
