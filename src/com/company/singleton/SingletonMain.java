package com.company.singleton;

/**
 * (Creational)
 * Ensures a class has only one instance and provides
 * a global point of access to it.
 * 1. Private Constructor.
 * 2. Private static instance.
 * 3. Factory static method for creation.
 */
public class SingletonMain {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
    }
}
