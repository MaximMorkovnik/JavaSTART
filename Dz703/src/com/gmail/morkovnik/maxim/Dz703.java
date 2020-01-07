package com.gmail.morkovnik.maxim;

import java.io.File;

public class Dz703 {

    public static void main(String[] args) {

        File f1 = new File("Folder");
        f1.mkdirs();
        listCatalog(f1);
    }

    public static void listCatalog(File f1) {
        if (f1.isDirectory()) {
            File[] otherFolders = f1.listFiles();
            for (int i = 0; i < otherFolders.length; i++) {
                if (otherFolders[i].isDirectory()) {
                    System.out.println(otherFolders[i]);
                }
            }
        }
    }
}

