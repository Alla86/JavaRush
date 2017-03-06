package com.javarush.test.level09.lesson02.task04;

/* Стек-трейс длиной 10 вызовов
Напиши код, чтобы получить стек-трейс длиной 10 вызовов.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return method2();
    }

    public static StackTraceElement[] method2()
    {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return method3();//напишите тут ваш код

    }

    public static StackTraceElement[] method3()
    {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return method4(); //напишите тут ваш код

    }

    public static StackTraceElement[] method4()
    {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return method5(); //напишите тут ваш код

    }

    public static StackTraceElement[] method5()
    {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return method6();

    }

    public static StackTraceElement[] method6()
    {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return method7();//напишите тут ваш код

    }

    public static StackTraceElement[] method7()
    {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return method8();

    }

    public static StackTraceElement[] method8()
    {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return method9();//напишите тут ваш код

    }

    public static StackTraceElement[] method9()
    {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return method10();
    }

    public static StackTraceElement[] method10()
    {

        return Thread.currentThread().getStackTrace();
    }
}
