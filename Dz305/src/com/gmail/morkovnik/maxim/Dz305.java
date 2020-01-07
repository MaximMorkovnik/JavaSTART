package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz305 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number h:");
        int h = sc.nextInt();

        String str = "";
        for (int i = 0; i < h * 2; i++) {
            if (i < h) {
                str = str + "*";
                System.out.println(str);
            } else {
                str = str.substring(1);
                System.out.println(str);
            }
        }
        sc.close();
    }
}