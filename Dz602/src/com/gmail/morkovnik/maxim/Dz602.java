/*
 * Написать свой вариант метода Arrays.toString() для int[].
 */
package com.gmail.morkovnik.maxim;

public class Dz602 {

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5 };
        System.out.println(arrayToS(a));
    }

    public static String arrayToS(int[] a) {
        String str = "[";
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                str = str + a[i];
            } else {
                str = str + a[i] + ",";
            }
        }
        return str + "]";
    }
}

