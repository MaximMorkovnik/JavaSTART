/*
 * Напишите метод для считывания двухмерного массива из
 * файла (размер массива заранее неизвестен, определите его
 * сами на основе данных в файле).
 */
package com.gmail.morkovnik.maxim;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Dz704 {

    public static void main(String[] args) {
        String text = readTextFromFile("Array.txt");
        int[][] a = fillTheArray(text);
        printArray(a);
    }

    private static String readTextFromFile(String name) {
        File f1 = new File(name);
        StringBuilder sb = new StringBuilder();
        String text;

        try (BufferedReader br = new BufferedReader(new FileReader(f1))) {
            while ((text = br.readLine()) != null)
                sb.append(text).append(System.lineSeparator());
        } catch (IOException e) {
            System.out.println(e);
        }
        return sb.toString();
    }

    private static int[][] fillTheArray(String text) {
        // Определяю размер массива
        int height = 0;
        int width = 0;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == '[')
                height++;
            else if (height == 1 && (text.charAt(i) == ',' || text.charAt(i) == ']'))
                width++;
        // Создаю массив
        int[][] a = new int[height][width];
        // Заполняю массив
        String n = ""; // число в массиве
        int row = -1; // строка
        int col = -1; // столбец
        for (int i = 0; i < text.length(); i++)
            switch (text.charAt(i)) {
                case '[':
                    row++;
                    col++;
                    n = "";
                    break;
                case ',':
                    a[row][col] = Integer.parseInt(n);
                    col++;
                    n = "";
                    break;
                case ']':
                    a[row][col] = Integer.parseInt(n);
                    n = "";
                    col = -1;
                    break;
                case ' ':
                case '\r':
                case '\n':
                    break;
                default:
                    n += text.charAt(i);
            }
        return a;
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(Arrays.toString(a[i]));
    }
}
