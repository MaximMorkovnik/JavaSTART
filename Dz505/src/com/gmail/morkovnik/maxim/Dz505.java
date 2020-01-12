/*
 * Напишите метод который вернет количество слов в строке текста.
 */
package com.gmail.morkovnik.maxim;

import java.util.*;

public class Dz505 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String a = sc.nextLine();
        System.out.println("The number of words in the text is: " + wordsQuantity(a));
        sc.close();
    }

    static int wordsQuantity(String st) {
        String[] words = st.split(" ");
        int x = words.length;
        return x;
    }
}

