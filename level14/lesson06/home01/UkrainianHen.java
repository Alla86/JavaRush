package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Alla on 01.06.16.
 */

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 1000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}