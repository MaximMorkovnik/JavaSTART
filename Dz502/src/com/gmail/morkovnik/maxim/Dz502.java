/*
 * Реализуйте метод параметрами которого являются - целое число,
 * вещественное число и строка. Возвращает он конкатенацию строки с
 * суммой вещественного и целого числа.
 */
package com.gmail.morkovnik.maxim;

public class Dz502 {

    public static void main(String[] args) {

        int a = 5;
        double b = 7.4;
        String c = "Summ ";
        System.out.println(max(a, b, c));
    }

    static String max(int a, double b, String c) {
        String x = c + Double.toString(a + b);
        return x;
    }
}
