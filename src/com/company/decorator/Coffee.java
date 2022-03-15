package com.company.decorator;

public abstract class Coffee {
    protected String description = "Unknown Coffee";

    String getDescription() {
        return description;
    }

    abstract double cost();
}
