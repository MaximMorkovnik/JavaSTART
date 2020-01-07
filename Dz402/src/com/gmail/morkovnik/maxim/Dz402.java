package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz402 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;
        int[] a;

        System.out.print("Input the size of the array: ");
        size = sc.nextInt();
        System.out.println();

        a = new int[size];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Input the number of array element[" + i + "] = ");
            a[i] = sc.nextInt();
            System.out.println();
        }
        System.out.println("An array[] = " + Arrays.toString(a));
        sc.close();
    }
}
