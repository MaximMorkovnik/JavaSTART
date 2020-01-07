package com.gmail.morkovnik.maxim;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Dz706 {

    public static void main(String[] args) {
        File f1 = new File("Wallpaper.txt");
        printWallpaper(f1);
    }

    public static void printWallpaper(File f1) {
        try (PrintWriter wr = new PrintWriter(f1)) {
            for (int i = 0; i < 40; i++) {
                for (int j = 0; j < 4; j++) {
                    wr.print("~~");
                    wr.print("--");
                    wr.print("++");
                    wr.print("##");
                    wr.print("!!");
                }
                wr.println("");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
