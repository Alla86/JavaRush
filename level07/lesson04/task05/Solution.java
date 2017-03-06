package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i1 = 0; i1 < array.length/2; i1++) //цикл от 0 до 9 - 10 итераций - заполняем массивы

        {
            array1[i1] = array[i1]; // арей 1 от 0 (до 9)
            array2[i1]= array[i1 + array.length/2]; // от 0+9 (до конца)
        }


        for (int s = 0; s<array2.length; s++)
        {
            System.out.println(array2[s]);
        }
//напишите тут ваш код

    }
}
