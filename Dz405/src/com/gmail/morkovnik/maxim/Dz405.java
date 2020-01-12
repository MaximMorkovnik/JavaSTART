/*
 * «Перевернуть массив». Т.е. написать программу которая повернет базовый
 * массив на 90,180,270 градусов по часовой стрелке. (При выполнении
 * задания использовать дополнительный массив нельзя). В примере показан
 * поворот на 90 градусов - (3 часа)
 * Было
 * [1, 2, 3, 4, 5, 6]
 * [1, 2, 3, 4, 5, 6]
 * [1, 2, 3, 4, 5, 6]
 * [1, 2, 3, 4, 5, 6]
 * [1, 2, 3, 4, 5, 6]
 * [1, 2, 3, 4, 5, 6]
 * Стало
 * [1, 1, 1, 1, 1, 1]
 * [2, 2, 2, 2, 2, 2]
 * [3, 3, 3, 3, 3, 3]
 * [4, 4, 4, 4, 4, 4]
 * [5, 5, 5, 5, 5, 5]
 * [6, 6, 6, 6, 6, 6]
 */
package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz405 {

    public static void main(String[] args) {

        int[][] a = new int[6][6];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = j + 1;
            }
            System.out.println(Arrays.toString(a[i]));
        }
//Rotation
        int degree = 90;
        for (int i = 1; i < 4; i++) {
            System.out.println();
            System.out.println("Angle of rotation = " + (degree * i));
            int b = 0;
            if (i % 2 != 0) {
                for (int j = 0; j < a.length; j++) {
                    if (j < a.length - 1) {
                        for (int k = j; k < a[0].length; k++) {
                            b = a[k][j];
                            a[k][j] = a[j][k];
                            a[j][k] = b;
                        }
                    }
                }
            } else {
                for (int j = 0; j < a.length; j++) {
                    if (j > 0 && j < a.length) {
                        for (int k = a.length - j; k > 0; k--) {
                            b = a[j - 1][k - 1];
                            a[j - 1][k - 1] = a[a.length - k][a.length - j];
                            a[a.length - k][a.length - j] = b;
                        }
                    }
                }
            }
//Print
            for (int k = 0; k < a.length; k++) {
                System.out.println(Arrays.toString(a[k]));
            }
        }
    }
}

