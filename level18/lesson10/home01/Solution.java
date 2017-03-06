package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int countLetters = 0;
        ArrayList<Character> fileContainsLetters = new ArrayList<>();

        if(args.length > 0) {
            File file = new File(args[0]);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String str = sc.nextLine().toLowerCase();
                char[] fileChars = str.toCharArray();
                for (char oneChar : fileChars) {
                    fileContainsLetters.add(oneChar);
                }
            }
            sc.close();
        }

        for (int i = 0; i < alphabet.length; i++){
            for (int k = 0; k < fileContainsLetters.size(); k++){
                if (alphabet[i] == (char)fileContainsLetters.get(k)){
                    countLetters++;
                }
            }
        }

        System.out.println(countLetters);
    }
}