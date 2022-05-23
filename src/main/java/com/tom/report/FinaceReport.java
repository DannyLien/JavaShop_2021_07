package com.tom.report;

public class FinaceReport implements Report {
    @Override
    public boolean load() {
        return false;
    }

    @Override
    public void print() {
        System.out.println("Finace Report print()");
    }
}
