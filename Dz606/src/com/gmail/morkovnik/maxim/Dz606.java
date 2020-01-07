package com.gmail.morkovnik.maxim;

import java.util.Scanner;

public class Dz606 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int distHemm = 0;
        System.out.println("Input first number and press Enter:");
        int n1 = sc.nextInt();
        System.out.println("Input second number and press Enter:");
        n1 ^= sc.nextInt();
        for (int i = 0; i < 32; i++) {
            if ((n1 & 1) != 0) {
                distHemm++;
            }
            n1 >>= 1;
        }
        System.out.println("Hamming distance is " + distHemm);
        sc.close();
    }
}

