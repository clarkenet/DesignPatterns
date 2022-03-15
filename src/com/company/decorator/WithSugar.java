package com.company.decorator;

public class WithSugar extends CoffeeDecorator {

    private final Coffee coffee;

    public WithSugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    double cost() {
        return coffee.cost() + 0.25;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", with Sugar";
    }
}
