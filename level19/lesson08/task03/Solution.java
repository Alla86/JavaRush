package com.javarush.test.level19.lesson08.task03;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* Выводим только цифры
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить только цифры
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Вывести модифицированную строку в консоль.

Пример вывода:
12345678
*/
public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream myByteOut = new ByteArrayOutputStream();
        PrintStream myOut = new PrintStream(myByteOut);
        System.setOut(myOut);
        testString.printSomething();
        System.setOut(out);
        String result =  myByteOut.toString().replaceAll("[^\\d]", "");
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}