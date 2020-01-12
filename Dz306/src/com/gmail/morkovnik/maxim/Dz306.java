/*
 * С помощью циклов вывести на экран все простые числа от 1 до 100.
 * Простое число — число которое делиться нацело только на единицу или
 * само на себя. Первые простые числа это — 2,3,5,7…
 */
package com.gmail.morkovnik.maxim;

public class Dz306 {

    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean simple = false;

            for (int j = 2; j * j <= i; j++) {
                simple = (i % j == 0);
                if (simple) {
                    break; // прерывает цикл
                }
            }
            if (!simple) {
                System.out.print(i + " ");
            }
        }
    }
}

