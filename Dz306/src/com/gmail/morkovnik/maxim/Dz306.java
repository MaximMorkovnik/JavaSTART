package com.gmail.morkovnik.maxim;

public class Dz306 {

    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean simple = false;

            for (int j = 2; j * j <= i; j++) {
                simple = (i % j == 0);
                if (simple) {
                    break; // прерывает цикл
                }
            }
            if (!simple) {
                System.out.print(i + " ");
            }
        }
    }
}

