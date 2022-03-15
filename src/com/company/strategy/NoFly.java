package com.company.strategy;

public class NoFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
