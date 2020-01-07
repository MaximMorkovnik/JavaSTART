package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz208 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 6-digit number and press Enter");
        int x = sc.nextInt();
        int x1 = (x / 100000);
        int x2 = (x % 100000 / 10000);
        int x3 = (x % 10000 / 1000);
        int x4 = (x % 1000 / 100);
        int x5 = (x % 100 / 10);
        int x6 = (x % 10);
        if (1000000 < x || 99999 > x) {
            System.out.println("You entered not 6-digit number! Try again, please.");
        } else if ((x1 == x6) && (x2 == x5) && (x3 == x4)) {
            System.out.println("This number is a palindrome!");
        } else {
            System.out.println("This number is not a palindrome.");
        }
        sc.close();
    }
}