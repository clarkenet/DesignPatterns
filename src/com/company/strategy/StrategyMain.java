package com.company.strategy;

/**
 * (Behavioural)
 * Defines a family of algorithms and encapsulates each one
 * and makes them interchangeable. The strategy lets the
 * algorithm vary independently from clients that use it.
 *
 * Create multiple instances of FlyBehaviour with different behaviour.
 * When creating ducks, pass the corresponding behaviour (by constructor in this case).
 */
public class StrategyMain {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new FlyWithWings());
        Duck redDuck = new RedDuck(new NoFly());

        mallardDuck.performFly(); //I'm flying!
        redDuck.performFly(); //I cannot fly!
    }
}
