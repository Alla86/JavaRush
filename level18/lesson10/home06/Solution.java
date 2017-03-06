package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/
import java.io.File;
        import java.io.FileInputStream;
        import java.io.IOException;
        import java.util.Map;
        import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0 || args[0].matches("А-Яа-я]}")) return;

        String path = args[0];
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        Map<Character, Integer> map = new TreeMap<Character, Integer>();

        while (fis.available() > 0) {
            int data = fis.read();
            Character ch = (char) data;
            if (!map.containsKey(ch)) map.put(ch, 1);
            else map.put(ch, map.get(ch) + 1);
        }
        fis.close();

        for (Map.Entry<Character, Integer> set : map.entrySet())
            System.out.println(set.getKey() + " " + set.getValue());
    }
}