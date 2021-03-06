/*
 * Создать массив случайных чисел (размером 15 элементов). Создайте
 * второй массив в два раза больше, первые 15 элементов должны быть
 * равны элементам первого массива, а остальные элементы заполнить
 * удвоенных значением начальных. Например
 * Было {1,4,7,2}
 * Стало {1,4,7,2,2,8,14,4}
 */
package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz403 {

    public static void main(String[] args) {

        Random rn = new Random();
        int[] arr1;

        arr1 = new int[15];

        for (int i = 0; i < arr1.length; i++) {

            arr1[i] = rn.nextInt(12);
        }

        System.out.println("An array[] arr1 = " + Arrays.toString(arr1));

        int[] arr2;

        arr2 = Arrays.copyOf(arr1, 2 * arr1.length);

        for (int i = 0; i < arr1.length; i++) {
            arr2[i + arr1.length] = arr2[i] * 2;
        }
        System.out.println("An array[] arr2 = " + Arrays.toString(arr2));
    }
}