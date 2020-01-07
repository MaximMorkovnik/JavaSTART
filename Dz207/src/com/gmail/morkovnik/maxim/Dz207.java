package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz207 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 4-digit number and press Enter");
        int x = sc.nextInt();
        int x1 = (x / 1000);
        int x2 = (x % 1000 / 100);
        int x3 = (x % 100 / 10);
        int x4 = (x % 10);
        if ((x1 + x2) == (x3 + x4)) {
            System.out.println("This is a lucky ticket!");
        } else {
            System.out.println("This is the usual number, you are lucky another time");
        }
        sc.close();
    }
}
