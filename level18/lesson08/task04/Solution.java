package com.javarush.test.level18.lesson08.task04;

/**
 * Created by Alla on 14.07.16.
 */
public class Solution {
    public static void main(String[] args) {
        try {
            TxtInputStream txtstream = new TxtInputStream("input.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
