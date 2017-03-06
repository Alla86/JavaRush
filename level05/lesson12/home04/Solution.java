package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

public class Solution
{
    public static void main(String[] args)
    {
        Date date1 = new Date(8, 1, 2016);
        String day0="";
        String month0="";
        if(date1.day<10) day0="0";
        if(date1.month<10) month0="0";
        System.out.println(day0+date1.day + " " +month0+date1.month + " " + date1.year);//напишите тут ваш код
    }

    public static class Date
    {
        private int day;
        private int month;
        private int year;

        public Date(int day)
        {
            this.day = day;
        }

        public Date(int day, int month)
        {
            this.day = day;
            this.month = month;
        }

        public Date(int day, int month, int year)
        {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
}

