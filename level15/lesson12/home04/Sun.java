package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Alla on 16.06.16.
 */
public class Sun implements Planet
{
    public static Sun instance;

    private Sun(){}

    public static Sun getInstance()
    {
        if (instance == null)
            instance = new Sun();
        return instance;
    }
}