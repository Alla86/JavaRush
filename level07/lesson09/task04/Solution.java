package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {

        for(int i=list.size()-1;i>=0;i--) //обход списка от конца к началу( размер списка минус 1. пока i >=0, проходить уменьшая на 1)
        {
            String cur = list.get(i); // cur -  текущий элемент списка
            if (cur.contains("р") && cur.contains("л")) continue; //оставить это слово без изменений.
            if (cur.contains("р")) { list.remove(i); continue;} //удалять из списка строк все слова, содержащие букву «р»
            if (cur.contains("л")) list.add(i, cur);//удваивать все слова содержащие букву «л». // добавить элемент cur в
            //позицию i
        }
        return list;
    }
}