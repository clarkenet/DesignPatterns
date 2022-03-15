package com.company.factory.standard;

import com.company.factory.standard.pizza.Pizza;
import com.company.factory.standard.store.NYPizzaStore;
import com.company.factory.standard.store.PizzaStore;

/**
 * (Creational)
 * Defines an interface for creating an object, but lets
 * subclasses decide which class to instantiate.
 * Factory methods let a class defer instantiation
 * to subclasses.
 *
 * The subclasses of the Factory (PizzaStore) are responsible for
 * generating the type of instances as required;
 */
public class FactoryMain {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pepperoni = pizzaStore.orderPizza("pepperoni");
        Pizza cheese = pizzaStore.orderPizza("cheese");
    }
}
