package com.javarush.test.level05.lesson05.task03;

/* Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
*/

public class Dog {

    private String name;
    private int age;  //добавьте тут переменные класса

    public String getName() { return this.name;    }
    public int getAge() { return this.age;    }

    public  void setName(String newName){
        this.name = newName;
    }

    public  void setAge(int newAge){
        this.age = newAge;
    }

    //добавьте тут геттеры и сеттеры
}
