package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.(
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r); //ввод строк с клавиатуры
        ArrayList<String> list = new ArrayList<String>();//создаю список строк
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            list.add(s);
            if (max <s.length()) max = s.length();// если минус 2 миллиарда меньше длинны строки,то макс = длинна строки
        }

        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i).length()== max)
            System.out.println( list.get(i) );//вывод содержимого коллекции на экран
        }

    }
}

