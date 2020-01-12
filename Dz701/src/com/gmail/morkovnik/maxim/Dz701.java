/*
 * Создайте консольный «текстовый редактор» с возможностью
 * сохранения набранного текста в файл.
 */
package com.gmail.morkovnik.maxim;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Dz701 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input text");
        File f1 = new File("a.txt");
        try (PrintWriter t = new PrintWriter(f1)) {
            t.print(sc.nextLine());
        } catch (IOException e) {
        }
        sc.close();
    }
}
