/*
 * Существуют такие последовательности чисел
 * 0,2,4,6,8,10,12
 * 1,4,7,10,13
 * 1,2,4,8,16,32
 * 1,3,9,27
 * 1,4,9,16,25
 * 1,8,27,64,125
 * Реализуйте программу которая выведет следующий член этой
 * последовательности (либо подобной им). Например пользователь вводит
 * строку 0,2,4,6,8,10,12 ответом программы должно быть число 14.(6 часов)
 */
package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz506 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the a series of numbers and press Enter: ");
        String line = sc.nextLine();
        while (line.contains(" ")) {
            String replace = line.replace(" ", "");
            line = replace;
        }
        String[] t = line.split("[,]");
        int[] numbers = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            numbers[i] = Integer.parseInt(t[i]);
        }

        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] > numbers[i]) {
                count++;
            }
        }
        if (count == numbers.length - 1) {
            String result = plus(numbers) + multiplication(numbers) + degree(numbers);
            if (result.equals("")) {
                System.out.println("Not found a similar series of numbers.");
            } else {
                System.out.print("The next number of the series is: " + result);
            }
        } else {
            System.out.println("The series of number is non-increasing.");
        }
        sc.close();
    }

    static String plus(int[] array) {
        String result = "";
        int count = 0;
        int[] step = new int[array.length - 1];
        for (int i = 0; i < step.length; i++) {
            step[i] = array[i + 1] - array[i];
        }
        for (int i = 0; i < step.length - 1; i++) {
            if (step[i] == step[i + 1]) {
                count++;
            }
        }
        if (count == step.length - 1) {
            result = array[array.length - 1] + step[0] + "";
        }
        return result;
    }

    static String multiplication(int[] array) {
        String result = "";
        int count = 0;
        double[] step = new double[array.length - 1];
        int l;
        if (array[0] == 0) {
            l = 1;
        } else {
            l = 0;
        }

        for (int i = l; i < step.length; i++) {
            step[i] = (double) array[i + 1] / array[i];
        }
        for (int i = 0; i < step.length - 1; i++) {
            if (step[i] == step[i + 1]) {
                count++;
            }
        }
        if (count == step.length - 1) {
            result = (int) (array[array.length - 1] * step[0]) + "";
        }
        return result;
    }

    static String degree(int[] array) {
        String result = "";
        int count = 0;
        double[] step = new double[array.length - 1];
        int l;
        if (array[0] == 0) {
            l = 1;
        } else {
            l = 0;
        }
        for (int i = 2; i < 20; i++) {
            for (int j = l; j < array.length - 1; j++) {
                double c = Math.pow(array[j + 1], (double) 1 / i) - Math.pow(array[j], (double) 1 / i);
                if (c >= 0.9999 && c <= 1.0001) {
                    step[j] = i;
                    count++;
                }
            }
        }
        if (count == step.length) {
            double d = Math.pow(array[array.length - 1], 1 / step[0]);
            result = Math.round(Math.pow((d + 1), step[0])) + "";
        }
        return result;
    }
}

