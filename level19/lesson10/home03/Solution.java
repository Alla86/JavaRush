package com.javarush.test.level19.lesson10.home03;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/
public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File(args[0]));

        while (file.hasNextLine()) {
            String str = file.nextLine();
            String[] person = str.replace("\n", "").split(" ");

            String personName = "";

            for (int i = 0; i < person.length - 3; i++){
                personName += person[i] + " ";
            }

            Calendar birthday = new GregorianCalendar(Integer.parseInt(person[person.length-1]),
                    Integer.parseInt(person[person.length-2]) - 1,
                    Integer.parseInt(person[person.length-3]));

            PEOPLE.add(new Person(personName.trim(), birthday.getTime()));
        }


        file.close();
    }
}