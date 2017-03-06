package com.javarush.test.level19.lesson05.task01;

import java.io.*;
import java.util.Scanner;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(sc.nextLine()));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(sc.nextLine()));
        sc.close();
        int b;
        for (b = in.read(); in.available() > 0; in.read()) {
            if (in.available() > 0) b = in.read();
            out.write(b);
        }
        in.close();
        out.close();
    }
}