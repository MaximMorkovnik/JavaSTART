package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz202 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the apartment number and press Enter");
        int x = sc.nextInt();
        int pod = 0;
        if (x > 0 && x <= 36) {
            pod = 1;
        }
        if (x > 36 && x <= 72) {
            pod = 2;
        }
        if (x > 72 && x <= 108) {
            pod = 3;
        }
        if (x > 108 && x <= 144) {
            pod = 4;
        }
        int level = (x - 36 * (pod - 1) - 1) / 4 + 1;
        if (x > 0 && x <= 144) {
            System.out.println("Section " + pod + ", level " + level);
        } else {
            System.out.println("There is no such apartment in the house");
        }
        sc.close();
    }
}
