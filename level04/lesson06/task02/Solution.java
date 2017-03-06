package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int m1 =(max(a,b));
        int m2 =(max(c,d));
        System.out.println(max(m1,m2));

    }
    public static int max(int a, int b)
    {
     if(a>b)
         return a;
        else
         return b;
    }
} //напишите тут ваш код
