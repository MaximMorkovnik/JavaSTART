package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz503 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input height of rectangle");
        int height = sc.nextInt();
        System.out.println("Input width of rectangle");
        int width = sc.nextInt();
        printRectangle(height, width);
        sc.close();
    }

    static void printRectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

