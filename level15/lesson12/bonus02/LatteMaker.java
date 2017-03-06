package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by Alla on 16.06.16.
 * 3. В отдельных файлах создать классы LatteMaker и TeaMaker, которые наследуются от DrinkMaker.
 */
public class LatteMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient() {
        System.out.println("Делаем кофе");
    }

    @Override
    void pour() {
        System.out.println("Заливаем молоком с пенкой");
    }
}