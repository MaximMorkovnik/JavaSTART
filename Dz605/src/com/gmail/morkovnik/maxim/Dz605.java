/*
 * Ввести с консоли дату. Сравнить ее с текущей датой в системе. Вывести
 * отличающиеся части (год, месяц) на экран.
 */
package com.gmail.morkovnik.maxim;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Dz605 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calendar curDate = Calendar.getInstance();
        Calendar myDateD = Calendar.getInstance();
        String diffDate = "";
        Date cDat = curDate.getTime(); // текущая дата

        System.out.println("Input day of date:");
        myDateD.set(Calendar.DAY_OF_MONTH, sc.nextInt());
        System.out.println("Input Month of date:");
        myDateD.set(Calendar.MONTH, (sc.nextInt() - 1));
        System.out.println("Input year of date:");
        myDateD.set(Calendar.YEAR, sc.nextInt());
        SimpleDateFormat outputDate = new SimpleDateFormat("dd.");
        SimpleDateFormat outputMonth = new SimpleDateFormat("MM.");
        SimpleDateFormat outputYear = new SimpleDateFormat("y.");

        if (curDate.get(Calendar.DAY_OF_MONTH) != myDateD.get(Calendar.DAY_OF_MONTH)) {
            diffDate += (outputDate.format(cDat));
        }
        if (curDate.get(Calendar.MONTH) != myDateD.get(Calendar.MONTH)) {
            diffDate += (outputMonth.format(cDat));
        }
        if (curDate.get(Calendar.YEAR) != myDateD.get(Calendar.YEAR)) {
            diffDate += (outputYear.format(cDat));
        }
        diffDate = diffDate.substring(0, diffDate.length() - 1); // метод substring() извлекает подстроку указывая
        // начальный и конечный индекс подстроки
        System.out.println(diffDate);
        sc.close();
    }
}
