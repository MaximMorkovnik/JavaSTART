package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz302 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number 4<n<16 and press Enter");
        int n = sc.nextInt();
        long x = 1;
        if (n <= 4 || n >= 16) {
            System.out.println("The wrong number");
        } else {
            for (int i = 1; i <= n; i++) {
                x = x * i;
            }
            System.out.println("Factorial of the number " + n + " = " + x);
        }
        sc.close();
    }
}
