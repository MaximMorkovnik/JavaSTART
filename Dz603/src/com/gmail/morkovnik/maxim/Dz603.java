/*
 * Ввести с консоли число в бинарном формате. Перевести его в
 * десятичный и вывести на экран (“10” -> 2).
 */
package com.gmail.morkovnik.maxim;

import java.util.Scanner;

public class Dz603 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Input a binary number and press Enter");

        try {
            n = sc.nextInt(2); // (2) обозначает что считываем в двоичной системе счисления
        } catch (Exception error) {
            n = sc.nextInt();
        }
        System.out.println("In Decimal, this number is " + n);
        sc.close();
    }
}
