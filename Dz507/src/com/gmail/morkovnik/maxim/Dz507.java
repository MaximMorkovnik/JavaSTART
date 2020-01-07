package com.gmail.morkovnik.maxim;

public class Dz507 {

    public static void main(String[] args) {

        int palindromMax = 0;
        int a = 0;
        int b = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                if (palindromTest(i * j) && (palindromMax < i * j)) {
                    palindromMax = i * j;
                    a = j;
                    b = i;
                }
            }
        }
        System.out.println("Самый большой палиндром от умножения чисел " + a + " и " + b + " = " + palindromMax);
    }

    static boolean palindromTest(int number) {
        boolean result = false;
        String strReverse = "";
        String str = Integer.toString(number);
        if (str.length() == 6) {
            strReverse = new StringBuffer(str).reverse().toString();
            if (str.equals(strReverse)) {
                result = true;
            }
        }
        return result;
    }
}

