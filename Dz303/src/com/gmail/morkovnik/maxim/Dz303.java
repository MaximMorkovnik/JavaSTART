/*
 * Напечатайте таблицу умножения на 5. предпочтительно печатать
 * 1 x 5 =5, 2 x 5 = 10, а не просто 5, 10 и т. д.
 */
package com.gmail.morkovnik.maxim;

public class Dz303 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            int x = i * 5;
            System.out.println(i + " * 5 = " + x);
        }
    }
}