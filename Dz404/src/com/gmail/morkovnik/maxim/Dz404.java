package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz404 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("Input text: ");
        str = sc.next();

        char[] a;
        int count = 0;

        a = str.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'b') {
                count = count + 1;
            }
        }
        System.out.println("Amount symbols 'b' = " + count);
        sc.close();
    }
}
