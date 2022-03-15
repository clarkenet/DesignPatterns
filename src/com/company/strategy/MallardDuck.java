package com.company.strategy;

public class MallardDuck extends Duck {
    public MallardDuck(FlyBehaviour flyBehaviour) {
        super(flyBehaviour);
    }

    @Override
    public void performFly() {
        flyBehaviour.fly();
    }
}
