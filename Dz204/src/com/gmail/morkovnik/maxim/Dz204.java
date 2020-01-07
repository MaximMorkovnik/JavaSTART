package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz204 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first side of the triangle and press Enter");
        double a = sc.nextInt();
        System.out.println("Input the second side of the triangle and press Enter");
        double b = sc.nextInt();
        System.out.println("Input the third side of the triangle and press Enter");
        double c = sc.nextInt();
        sc.close();
        if (a + b > c && a + c > b && c + b > a)
            System.out.println("...Such a triangle exists...");
        else
            System.out.println("...Such a triangle does not exist...");
    }
}
