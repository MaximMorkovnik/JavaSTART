/*
 * Написать программу которая вернет количество миллисекунд
 * прошедших от такого же числа, но в прошлом месяце до сегодняшней
 * даты. Например если сегодня 3 августа, то узнать сколько миллисекунд
 * прошло с 3 июля.
 */
package com.gmail.morkovnik.maxim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Dz601 {

    public static void main(String[] args) {

        Date date1 = new Date();
        Date date2 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first date in format 20/12/2020 and press Enter.");
        String first = sc.nextLine();
        System.out.println("Input the second date in format 20/12/2020 and press Enter.");
        String second = sc.nextLine();
        sc.close();
        try {
            date1 = sdf.parse(first); // parse() преобразовывает строку в дату
        } catch (ParseException e) { // format() преобразовывает дату в строку
            e.printStackTrace();
        }
        try {
            date2 = sdf.parse(second);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("In this time period " + (date1.getTime() - date2.getTime()) + " milliseconds.");
    }// getTime() возвращает количество миллисекунд с 1 января 1970
}

