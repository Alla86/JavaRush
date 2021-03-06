package com.javarush.test.level08.lesson08.task04;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Agilera", new Date("JULY 1 1980"));
        map.put("Speers", new Date("AUGUST 1 1980"));
        map.put("Shepord", new Date("OCTOBER 1 1980"));
        map.put("Villa", new Date("MARCH 1 1980"));
        map.put("Dolce", new Date("APRIL 1 1980"));
        map.put("Guchi", new Date("SEPTEMBER 1 1980"));
        map.put("Armani", new Date("NOVEMBER 1 1980"));
        map.put("Hifiger", new Date("DECEMBER 1 1980"));
        map.put("Zara", new Date("JUNE 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        ArrayList<String> keys = new ArrayList<String>();
        for (Map.Entry<String, Date> pair : map.entrySet()){
            if (pair.getValue().getMonth() >=5 && pair.getValue().getMonth() <= 7) {
                keys.add(pair.getKey());
            }
        }
        for (int i = 0; i < keys.size(); i++) {
            map.remove(keys.get(i));
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        System.out.println(createMap());
        removeAllSummerPeople(createMap());
    } //напишите тут ваш код
}


