package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz201 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number a:");
        int a = sc.nextInt();
        System.out.println("Input number b:");
        int b = sc.nextInt();
        System.out.println("Input number c:");
        int c = sc.nextInt();
        System.out.println("Input number d:");
        int d = sc.nextInt();
        int max;

        max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        System.out.println("Largest of the numbers " + max);
        sc.close();
    }
}