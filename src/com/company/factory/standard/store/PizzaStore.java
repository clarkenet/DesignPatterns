package com.company.factory.standard.store;

import com.company.factory.standard.pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
