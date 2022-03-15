package com.company.decorator;

/**
 * (Structural)
 * Attaches additionally responsibilities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 *
 * Create a Decorator (abstract class) which extends the base class (Coffee).
 * Create Decorator implementations (wrappers) which accept the base class to modify it.
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.printf("Description: %s, Cost: %.2f\n", espresso.getDescription(), espresso.cost());

        espresso = new WithMilk(espresso);
        espresso = new WithSugar(espresso);
        System.out.printf("Description: %s, Cost: %.2f\n", espresso.getDescription(), espresso.cost());
    }
}
