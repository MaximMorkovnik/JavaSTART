/*
 * Проверить, является ли четырехзначное число счастливым билетом.
 * Дано четырехзначное число. Проверить, является ли оно «счастливым
 * билетом». Примечание: счастливым билетом называется число, в
 * котором - при четном количестве цифр в числе сумма цифр его левой
 * половины равна сумме цифр его правой половины. Например,
 * рассмотрим число 1322. Его левая половина равна 13, а правая – 22, и
 * оно является счастливым билетом (т. к. 1 + 3 = 2 + 2)
 */
package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz207 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 4-digit number and press Enter");
        int x = sc.nextInt();
        int x1 = (x / 1000);
        int x2 = (x % 1000 / 100);
        int x3 = (x % 100 / 10);
        int x4 = (x % 10);
        if ((x1 + x2) == (x3 + x4)) {
            System.out.println("This is a lucky ticket!");
        } else {
            System.out.println("This is the usual number, you are lucky another time");
        }
        sc.close();
    }
}
