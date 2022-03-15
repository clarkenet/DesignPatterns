package com.company.factory.standard.store;

import com.company.factory.standard.pizza.Pizza;
import com.company.factory.standard.pizza.ny.NYStyleCheesePizza;
import com.company.factory.standard.pizza.ny.NYStylePepperoniPizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
