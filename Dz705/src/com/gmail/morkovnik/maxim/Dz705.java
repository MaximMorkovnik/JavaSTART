package com.gmail.morkovnik.maxim;

import java.io.File;
import java.util.*;
import java.io.IOException;

public class Dz705 {

    public static void main(String[] args) {
        File f1 = new File("Text.txt");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] alphabet = createAlphabet();
        String book = loadText(f1);
        int[] quantity = countLetters(book, alphabet);
        sortLetters(quantity, alphabet);
    }

    public static char[] createAlphabet() {
        char[] alphabet = new char[26];
        for (int i = 0; i <= 25; i++) {
            alphabet[i] = (char) ('a' + i);
        }
        return alphabet;
    }

    public static String loadText(File f1) {
        String book = "";
        StringBuilder sb = new StringBuilder();
        try (Scanner sc = new Scanner(f1)) {
            for (; sc.hasNextLine();) {
                sb.append(sc.nextLine());
                book = sb.toString().toLowerCase();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return book;
    }

    public static int[] countLetters(String book, char[] alphabet) {
        char[] bookText = new char[book.length()];
        book.getChars(0, book.length(), bookText, 0);
        int[] quantity = new int[alphabet.length];
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < bookText.length; j++) {
                if (alphabet[i] == bookText[j]) {
                    quantity[i] = quantity[i] + 1;
                }
            }
        }
        return quantity;
    }

    public static void sortLetters(int[] quantity, char[] alphabet) {
        int[] n = new int[quantity.length];
        for (int i = 0; i < quantity.length; i++) {
            n[i] = quantity[i];
        }
        Arrays.sort(quantity);
        for (int i = 0; i < quantity.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (quantity[quantity.length - 1 - i] == n[j]) {
                    System.out.println(alphabet[j] + " " + n[j]);
                    n[j] = -1;
                }
            }
        }
    }
}

