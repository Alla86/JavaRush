package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class  Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является максимальным */
            int max = array[i];
            int max_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который больше предположенного минимума*/
            for (int j = i + 1; j < array.length; j++)
            {
                //Если находим, запоминаем его индекс
                if (array[j] > max)
                {
                    max = array[j];
                    max_i = j;
                }
            }
        /*Если нашелся элемент,больше, чем на текущей позиции,
          меняем их местами*/
            if (i != max_i)
            {
                int tmp = array[i];
                array[i] = array[max_i];
                array[max_i] = tmp;
            }
        }
    }
}
