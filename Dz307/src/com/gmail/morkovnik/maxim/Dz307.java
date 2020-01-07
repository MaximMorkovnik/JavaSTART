package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz307 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the width of the shape"); // введите ширину фигуры
        int w = sc.nextInt();

        if (w % 2 == 0) {
            System.out.println("Wrong width value!");
        } else {
            for (int i = 1; i <= w; i++) {
                for (int j = 1; j <= w; j++) {
                    if (i >= j && i >= (w + 1) - j || (i <= j && i <= (w + 1) - j)) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }
                    if (j % w == 0) {
                        System.out.println("");
                    }
                }
            }
            sc.close();
        }
    }
}
