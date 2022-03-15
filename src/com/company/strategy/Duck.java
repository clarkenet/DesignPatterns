package com.company.strategy;

public abstract class Duck {
    //Needs protected access to let the concrete classes access to this
    protected FlyBehaviour flyBehaviour;

    public Duck(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void performFly() {
        flyBehaviour.fly();
    }
}
