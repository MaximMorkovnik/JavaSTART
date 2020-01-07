package com.gmail.morkovnik.maxim;

public class Dz604 {

    public static void main(String[] args) {

        for (int i = 2; i < 12; i++) {
            String a = String.format("%." + i + "f", Math.PI);
            System.out.println(a);
        }
    }
}
