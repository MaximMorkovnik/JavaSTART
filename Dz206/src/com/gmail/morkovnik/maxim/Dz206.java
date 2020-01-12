/*
 * Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1). Пользователь
 * вводит с клавиатуры координаты точки x и y. Написать программу которая
 * определит лежит ли эта точка внутри треугольника или нет.
 */
package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz206 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input X and press Enter");
        double x0 = sc.nextDouble();
        System.out.println("Input Y and press Enter");
        double y0 = sc.nextDouble();

        double x1 = 0;
        double x2 = 4;
        double x3 = 6;
        double y1 = 0;
        double y2 = 4;
        double y3 = 1;

        double v1 = (x1 - x0) * (y2 - y1) - (x2 - x1) * (y1 - y0);
        double v2 = (x2 - x0) * (y3 - y2) - (x3 - x2) * (y2 - y0);
        double v3 = (x3 - x0) * (y1 - y3) - (x1 - x3) * (y3 - y0);
        if (v1 >= 0 && v2 >= 0 && v3 >= 0 || v1 <= 0 && v2 <= 0 && v3 <= 0) {
            System.out.println("This point lies inside the triangle");
        } else {
            System.out.println("This point does not lie inside the triangle");
        }
        sc.close();
    }
}