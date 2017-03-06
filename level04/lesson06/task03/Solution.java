package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(reader.readLine()));
        list.add(Integer.parseInt(reader.readLine()));
        list.add(Integer.parseInt(reader.readLine()));
        Collections.sort(list, Collections.<Integer>reverseOrder());
        for(int x:list) System.out.println(x);


//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());
//        int min=0;
//        int mid=0;
//        int max=0;
//        if (a >= b && a >= c)
//        {
//            max = a;
//            if (b >= c)
//            {
//                mid = b;
//                min = c;
//            } else
//            {
//                mid = c;
//                min = b;
//            }
//        }
//        if (c >= a && c >= b)
//        {
//            max = c;
//            if (a >= b)
//            {
//                mid = a;
//                min = b;
//            } else
//            {
//                mid = b;
//                min = a;
//            }
//        }
//        if (b >= a && b >= c)
//        {
//            max = b;
//            if (a >= c)
//            {
//                mid = a;
//                min = c;
//            } else
//            {
//                mid = c;
//                min = a;
//            }
//
//        }
//        System.out.println(max);
//        System.out.println(mid);
//        System.out.println(min);
    }
}