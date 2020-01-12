/*
 * Программа, которая вычислит и выведет на экран длину окружности, если ее
 * радиус считывается с клавиатуры
 */
package com.gmail.morkovnik.maxim;

import java.util.Scanner;

public class Dz103 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the radius of the circle and press Enter");
        double r = sc.nextDouble();
        double c = 2 * Math.PI * r;
        System.out.println("Circumference = " + c);
        sc.close();
    }

}
