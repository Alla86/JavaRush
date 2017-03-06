package com.javarush.test.level08.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        isDateOdd("FEBRUARY 4 2000");
    }


    public static boolean isDateOdd(String date)
    {
        Date curDate = new Date(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("D");
        String dayOldFormat = dateFormat.format(curDate);
        System.out.println(dayOldFormat);
        int dayNewFormat = Integer.parseInt(dayOldFormat);
        System.out.println(dayNewFormat % 2 != 0);
        return dayNewFormat % 2 != 0;
    }
 }

