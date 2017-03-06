package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by Alla on 16.06.16.
 */

public abstract class DrinkMaker {
    abstract void getRightCup(); // - выбрать подходящую чашку
    abstract void putIngredient(); // - положить ингредиенты
    abstract void pour(); // - залить жидкостью

    public void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}