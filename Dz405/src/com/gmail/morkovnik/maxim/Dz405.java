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

