package com.company.factory.standard.pizza.ny;

import com.company.factory.standard.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing NY Style Cheese Pizza...");
        //May have a different preparation
    }

    @Override
    public void bake() {
        System.out.println("Baking NY Style Cheese Pizza...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NY Style Cheese Pizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing NY Style Cheese Pizza...");
    }
}
