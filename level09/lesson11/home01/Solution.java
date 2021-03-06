package com.javarush.test.level09.lesson11.home01;

/* Деление на ноль
Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        processExceptions(new Solution());
    }
    public static void processExceptions(Solution exception) throws Exception
    {
        try
        {
            divisionByZero();
        }
        catch (ArithmeticException e)
        {


            e.printStackTrace();
        }
    }
    public static void divisionByZero()
    {
        int c = 148 / 0;
        System.out.println(c);
    }
    public static void printStackTrace(Throwable throwable)
    {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace())
        {
            System.out.println(element);
        }
    }
}