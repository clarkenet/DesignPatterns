package com.company.decorator;

public class WithMilk extends CoffeeDecorator {
    private final Coffee coffee;

    public WithMilk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    double cost() {
        return coffee.cost() + 0.50;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", with Milk";
    }
}
