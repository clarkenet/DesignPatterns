package com.company.decorator;

public class Espresso extends Coffee {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    double cost() {
        return 1.99;
    }
}
