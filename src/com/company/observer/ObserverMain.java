package com.company.observer;

import java.util.Random;

/**
 * (Behavioural)
 * Defines a one to many dependency between objects, so that when one object
 * changes its state, all of their dependents are notified and updated automatically.
 *
 * The publisher contains a list of observers. This is updated when a new observer
 * is registered.
 * In order to get registered, each observer/subscriber registers to the publisher
 * itself (Pass the publisher to its constructor and registers).
 * When new data is coming, the publisher iterates over the list of subscribers
 * and notify each one of them about the change.
 */
public class ObserverMain {
    public static void main(String[] args) throws InterruptedException {
        //Publisher/Topic
        WeatherStation weatherStation = new WeatherStation();

        //Subscribers
        Observer currentConditions = new CurrentConditionsDisplay(weatherStation);
        Observer forecast = new ForecastDisplay(weatherStation);

        //Simulate updates
        for (int i = 0; i < 5; i++) {
            System.out.println("\n--- Update " + i + " ---");

            int randomTemp = getRandomInt(-50, 40);
            int randomHumidity = getRandomInt(0, 100);

            weatherStation.measurementChanged(randomTemp, randomHumidity); // Each observer displays the updates

            Thread.sleep(1000);
        }
    }

    private static int getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max + 1 - min) + min;
    }


}
