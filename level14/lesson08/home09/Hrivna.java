package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Alla on 09.06.16.
 */
public class Hrivna extends Money {
    public Hrivna(double amount) {
        super(amount);
    }

    public String getCurrencyName() {
        return "HRN";
    }
}
