package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int mid = 0;
        if (a >= b && a >= c)
        {
            if (b >= c)
            {
                mid = b;
            } else
            {
                mid = c;
            }
        }
        if (c >= a && c >= b)
        {
            if (a >= b)
            {
                mid = a;
            } else
            {
                mid = b;
            }
        }
        if (b >= a && b >= c)
        {
            if (a >= c)
            {
                mid = a;
            } else
            {
                mid = c;
            }

        }
        System.out.println(mid);
    }
}