package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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
        return map;//напишите тут ваш код
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> ci = new HashMap<String, String>(map);
        HashMap<String, String> cj = new HashMap<String, String>(map);

        for (Iterator<Map.Entry<String, String>> j = cj.entrySet().iterator(); j.hasNext(); ) {
            Map.Entry<String, String> pj = j.next();
            int cnt = 0;
            for (Iterator<Map.Entry<String, String>> i = ci.entrySet().iterator(); i.hasNext(); ) {
                Map.Entry<String, String> pi = i.next();
                if ( pi.getValue().equals(pj.getValue()) ) {
                    cnt ++;
                    if (cnt >= 2) {
                        i.remove();
                        removeItemFromMapByValue(map, pi.getValue());
                    }
                }
            }
            if (cnt >= 2) {
                j.remove();
                removeItemFromMapByValue(map, pj.getValue());
            }
        }
        System.out.println(map);

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
