package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
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
        map.put("Kuznetsova", "Tatyana");
        return map;
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
}
