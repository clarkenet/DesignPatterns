package com.company.strategy;

public class RedDuck extends Duck{
    public RedDuck(FlyBehaviour flyBehaviour) {
        super(flyBehaviour);
    }

    @Override
    public void performFly() {
        flyBehaviour.fly();
    }
}
