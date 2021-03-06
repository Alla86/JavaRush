package com.javarush.test.level18.lesson10.home09;

/* Файлы и исключения
Читайте с консоли имена файлов
Если файла не существует (передано неправильное имя файла), то
перехватить исключение FileNotFoundException, вывести в консоль переданное неправильное имя файла и завершить работу программы.
Закрыть потоки. Не использовать try-with-resources
Не используйте System.exit();
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = null;
        String name = new String();
        try {
            while (true) {
                name = reader.readLine();
                fis = new FileInputStream(name);
            }
        } catch (FileNotFoundException e) {
            System.out.print(name);
        }
        catch (IOException ignore) {/*NOP*/}
        finally {
            try {
                if (fis!=null) fis.close();
                reader.close();
            } catch (IOException ignore) {/*NOP*/}
        }
    }
}