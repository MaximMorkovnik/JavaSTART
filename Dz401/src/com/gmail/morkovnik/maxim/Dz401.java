package com.gmail.morkovnik.maxim;

public class Dz401 {

    public static void main(String[] args) {

        int x = 0;
        int[] a = { 0, 5, 2, 4, 7, 1, 3, 19 };

        for (int i = 0; i < a.length; i++) {
            System.out.println("array[" + i + "] = " + a[i]);
            if (a[i] % 2 != 0) {
                x++;
            }
        }
        System.out.println("In the array " + x + " unpaired numbers");
    }
}