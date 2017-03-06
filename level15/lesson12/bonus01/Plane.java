package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Alla on 16.06.16.
 * 2. Класс Plane должен иметь 1 конструктор с параметром int - количество перевозимых пассажиров.
 */
public class Plane implements Flyable {
    private int passangers = 0;

    public Plane(int passangers) {
        this.passangers = passangers;
    }

    @Override
    public void fly() {

    }
}