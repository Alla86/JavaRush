package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String letters = reader.readLine();
        String number = reader.readLine();
        int a = Integer.parseInt(number);
        while (a >= 1)
        {
            System.out.println(letters);
            a--;
        }//напишите тут ваш код

    }
}
