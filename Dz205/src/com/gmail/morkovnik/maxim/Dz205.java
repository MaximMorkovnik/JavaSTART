/*
 * Есть круг с центром в начале координат и радиусом 4. Пользователь
 * вводит с клавиатуры координаты точки x и y. Написать программу которая
 * определит лежит ли эта точка внутри круга или нет.
 */
package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz205 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input coordinate x:");
        double x = sc.nextDouble();
        System.out.println("Input coordinate y:");
        double y = sc.nextDouble();

        double r = 4.0;
        double c = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (c <= r) {
            System.out.println("This point lies inside the circle");
        } else {
            System.out.println("This point does not lie inside the circle");
        }
        sc.close();
    }
}
