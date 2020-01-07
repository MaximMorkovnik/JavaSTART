package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz406 {

    public static void main(String[] args) {

        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        int[] a;

        System.out.print("Input the size of the array: ");
        a = new int[sc.nextInt()];

        for (int i = 0; i < a.length; i++) {
            a[i] = rn.nextInt(10);
        }
        System.out.println("Initial array - " + Arrays.toString(a));

        for (int i = 0; i < a.length / 2; i++) {
            int b = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = b;
        }
        System.out.println("Mirror array - " + Arrays.toString(a));
        sc.close();
    }
}

