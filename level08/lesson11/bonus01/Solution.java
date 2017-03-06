package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strMonth = reader.readLine();

        System.out.println(getNumMonth(strMonth));

    }

    public static String getNumMonth(String strMonth)
    {
        List<String> numMonth = new ArrayList<>();
        numMonth.add("January");
        numMonth.add("February");
        numMonth.add("March");
        numMonth.add("April");
        numMonth.add("May");
        numMonth.add("June");
        numMonth.add("July");
        numMonth.add("August");
        numMonth.add("September");
        numMonth.add("October");
        numMonth.add("November");
        numMonth.add("December");

        int num = numMonth.indexOf(strMonth) + 1;

        return strMonth + " is " + num + " month";
    }

}