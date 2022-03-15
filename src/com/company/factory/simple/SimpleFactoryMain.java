package com.company.factory.simple;

public class SimpleFactoryMain {
    public static void main(String[] args) {
        SimplePizzaFactory spf = new SimplePizzaFactory();
        Pizza pepperoniPizza = spf.makePizza("pepperoni");
    }
}

abstract class Pizza {

}

class PepperoniPizza extends Pizza {

}

class CheesePizza extends Pizza {

}

class SimplePizzaFactory {
    public Pizza makePizza(String type) {
        if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equals("cheese")) {
            return new CheesePizza();
        } else {
            return null;
        }
    }
}