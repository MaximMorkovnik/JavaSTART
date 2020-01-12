/*
 * Выведите на экран прямоугольник из *. Причем высота и ширина
 * прямоугольника вводятся с клавиатуры. Например ниже представлен
 * прямоугольник с высотой 4 и шириной 5.
 * *****
 * *   *
 * *   *
 * *****
 */
package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz304 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number w:");
        int w = sc.nextInt();

        System.out.println("Input number h:");
        int h = sc.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (j == 1 || j == w || i == 1 || i == h) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        sc.close();
    }
}

