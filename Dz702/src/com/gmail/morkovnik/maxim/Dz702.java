/*
 * Напишите метод для сохранения в текстовый файл
 * двухмерного массива целых чисел.
 */
package com.gmail.morkovnik.maxim;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Dz702 {

    public static void main(String[] args) {

        Random r = new Random();
        int[][] a = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = r.nextInt(10);
            }
        }
        writeTo(a);
    }

    public static void writeTo(int[][] a) {
        File f1 = new File("Array.txt");

        try (PrintWriter t = new PrintWriter(f1)) {
            for (int i = 0; i < a.length; i++) {
                t.println();
                for (int j = 0; j < a.length; j++) {
                    if (j == 0) {
                        t.print("[");
                    }
                    if (j == a.length - 1) {
                        t.print(a[i][j] + "]");
                    } else {
                        t.print(a[i][j] + ",");
                    }
                }
            }
        } catch (FileNotFoundException e) { // обработка исключения, если файл не найден
            e.printStackTrace();
        }
    }
}