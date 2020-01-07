package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz504 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input element to search and press enter: ");
        int a = sc.nextInt();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Array index: " + search(arr, a));
        sc.close();
    }

    static int search(int[] arr, int x) {
        int n = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                n = i;
                break;
            }
        }
        return n;
    }
}

