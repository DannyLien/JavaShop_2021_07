package com.tom.report;

public class HealthReport implements Report {
    @Override
    public boolean load() {
        return false;
    }

    @Override
    public void print() {
        System.out.println("Health Report print");
    }
}
