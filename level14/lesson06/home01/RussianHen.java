package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Alla on 01.06.16.
 */

public class RussianHen extends Hen {
    static String country = Country.RUSSIA;
    @Override
    public int getCountOfEggsPerMonth() {
        return 80000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}