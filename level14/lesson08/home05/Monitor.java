package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Alla on 01.06.16.
 3. Создай классы Keyboard, Mouse, Monitor, которые реализуют интерфейс CompItem.
 4. Метод getName() должен возвращать имя класса, например, для класса Keyboard будет "Keyboard".
 */

    public class Monitor implements CompItem {
        private Monitor monitor;
        public String getName() { return this.getClass().getSimpleName();}
}
