package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/



public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String> arrayList[] = new ArrayList[3];
        arrayList[0] = new ArrayList <String>();
        arrayList[0].add("aaaaaaaaaaaa");
        arrayList[0].add("bbbbbbbbb");
        arrayList[0].add("ccccccccccc");

        arrayList[1] = new ArrayList <String>();
        arrayList[1].add("1");
        arrayList[1].add("2");
        arrayList[1].add("3");

        arrayList[2] = new ArrayList <String>();
        arrayList[2].add("sdfdrbverb");
        arrayList[2].add("brtbgerg3er");
        arrayList[2].add("erf34f34");
        return arrayList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}
