/*
 * Определить количество дней в году, который вводит пользователь. В
 * високосном годе - 366 дней, тогда как в обычном 365. Високосный год
 * определяется по следующему правилу:
 * Год високосный, если он делится на четыре без остатка, но если он
 * делится на 100 без остатка, это не високосный год. Однако, если он
 * делится без остатка на 400, это високосный год.
 */
package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz203 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input year and press Enter");
        int x = sc.nextInt();
        sc.close();
        if (x % 4 != 0 || x % 100 == 0 && x % 400 != 0)
            System.out.println("In this year 365 days");
        else
            System.out.println("In this year 366 days");
    }
}
