package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream fileOne = new FileInputStream(fileName1);
        FileOutputStream fileTwo = new FileOutputStream(fileName2);
        FileOutputStream fileThree = new FileOutputStream(fileName3);

        int lengthSecondFile;

        while (fileOne.available() > 0) {

            if (fileOne.available() % 2 == 0) {
                lengthSecondFile = fileOne.available() / 2;
            } else
                lengthSecondFile = fileOne.available() / 2 + 1;

            byte[] bufferForSecondFile = new byte[lengthSecondFile];
            byte[] bufferForThreadFile = new byte[fileOne.available() / 2];

            fileTwo.write(bufferForSecondFile, 0, fileOne.read(bufferForSecondFile));

            fileThree.write(bufferForThreadFile, 0, fileOne.read(bufferForThreadFile));
        }
        reader.close();
        fileOne.close();
        fileTwo.close();
        fileThree.close();
    }
}