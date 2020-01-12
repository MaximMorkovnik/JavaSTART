/*
 * С помощью циклов нарисовать «обои». Причем количество полос
 * должно вводиться с клавиатуры. В примере 7 полос.
 * ***+++***+++***+++***
 * ***+++***+++***+++***
 * ***+++***+++***+++***
 * ***+++***+++***+++***
 * ***+++***+++***+++***
 */
package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz301 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number and press Enter");
        int n = sc.nextInt();
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 0) {
                    System.out.print("+++");
                } else {
                    System.out.print("***");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
