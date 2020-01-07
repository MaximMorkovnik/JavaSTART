package com.gmail.morkovnik.maxim;

import java.util.Scanner;

public class Dz607 {

    public static void main(String[] args) {
        String input;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input numbers: ");
        input = sc.nextLine();
        if (!isNumber(input) || input.length() < 2) {
            System.out.println("Input Error!");
            System.exit(0);
        }
        result = detectNumber(input);
        if (result.isEmpty()) {
            System.out.println("No sequence!"); // "No sequence" - нет последовательности
            System.exit(0);
        }
        System.out.println("Base number: " + result);
        sc.close();
    }

    static String detectNumber(String str) {
        String result = "";
        int nCount = 1;
        int nLength = 1;
        String firstNum = "";
        String nextNum = "";
        while (nLength * nCount + nLength <= str.length()) {
            firstNum = str.substring(0, nLength);
            nextNum = str.substring(nLength * nCount, nLength * nCount + nLength);
            if (firstNum.equals(nextNum)) {
                nCount++;
            } else {
                nLength++;
                nCount = 1;
            }
        }
        if ((nLength * nCount) == str.length() && nLength != str.length() && nCount > 1) {
            result = firstNum;
        }
        return result;
    }

    static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

