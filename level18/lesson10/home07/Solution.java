package com.javarush.test.level18.lesson10.home07;

/* Поиск данных внутри файла
Считать с консоли имя файла
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int)
Закрыть потоки. Не использовать try-with-resources

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity

где id - int
productName - название товара, может содержать пробелы, String
price - цена, double
quantity - количество, int

Информация по каждому товару хранится в отдельной строке
*/

import java.io.*;



public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String path = bufferedReader.readLine();
            BufferedReader bufferedReader1 = new BufferedReader(new FileReader(path));
            String tmpStr;
            while (bufferedReader1.ready()) {
                tmpStr = bufferedReader1.readLine();
                String[] splitStr = tmpStr.split(" "); // распарсили строку в splitStr
                if (splitStr[0].equals(args[0])) {  // если нашли искомую строку с указанным id
                    StringBuilder stringOut = new StringBuilder();
                    stringOut.append(splitStr[0]).append(" ");
                    for (int i = 1; i <= splitStr.length - 3; i++) {
                        stringOut.append(splitStr[i]).append(" ");
                    }
                    stringOut.append(splitStr[splitStr.length - 2]).append(" ").append(splitStr[splitStr.length - 1]);
                    System.out.println(stringOut);
                }
            }
            bufferedReader.close();
            bufferedReader1.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}