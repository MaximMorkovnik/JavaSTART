/*
 * Напишите метод который вернет максимальное число
 * из массива целых чисел.
 */
package com.gmail.morkovnik.maxim;

public class Dz501 {

    public static void main(String[] args) {

        int[] a = new int[] { 1, 5, 22, 4, 9 };
        System.out.println(max(a));
    }

    /**
     * Search for the maximum number of array
     *
     * @param a <code> int [] </code> array
     * @return Maximum number of array
     * @author maxim.morkovnik
     */
    public static int max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }
}