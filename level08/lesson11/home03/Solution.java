package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Gryschenko", "Alisa");
        map.put("Teslya", "Alla");
        map.put("Khotynetskaya", "Maryna");
        map.put("Onufriev", "Vladyslav");
        map.put("Grindvoid", "Maksym");
        map.put("Stakhova", "Natasha");
        map.put("Kravtsova", "Maryna");
        map.put("Mruga", "Igor");
        map.put("Berestovaya", "Svetlana");
        map.put("Gryschenko", "Tatyana");
        return map;//напишите тут ваш код
    }
    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (String tmp : map.values()) // для каждого элемента из значений (валюе)
        {
            if (name.equals(tmp))
            {
                count++;
            }
        }
        return count;
    }
    //напишите тут ваш код

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        return map.containsKey(lastName) ? 1 : 0;
    }
    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
