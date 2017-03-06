         package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int sum = 0;
        while (true)
        {
            String name = reader.readLine();
            if (name.equals("сумма"))
                break;
            int a = Integer.parseInt(name);
            sum = sum+a;

        }
        System.out.println(sum);
    }
    //напишите тут ваш код
}

