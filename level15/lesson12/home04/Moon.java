package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Alla on 16.06.16.
 */
public class Moon implements Planet {
    private Moon() {}

    private static Moon instance;

    public synchronized static Moon getInstance() {
        if (instance == null)
            instance = new Moon();
        return instance;
    }
}