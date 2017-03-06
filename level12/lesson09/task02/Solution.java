package com.javarush.test.level12.lesson09.task02;

/* Интерфейсы Fly, Run, Swim
Напиши public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавить в каждый интерфейс по одному методу.
*/

public class Solution {
    public static void main(String[] args) {

    }

    interface Fly {
        void speed();

        int getX();

    }
    interface Run {
        void speed();

        int getX();

    }
    interface Swim {
        void speed();

        int getX();//add interfaces here - добавь интерфейсы тут

    }
}