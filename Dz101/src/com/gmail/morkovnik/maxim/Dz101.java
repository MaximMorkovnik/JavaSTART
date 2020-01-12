/*
 * Программа, которая считывает 5-и значное число с клавиатуры и выводит цифры
 * из которого оно состоит
 */
package com.gmail.morkovnik.maxim;

import java.util.Scanner;

public class Dz101 { 
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input 5-digit number and press Enter");
		{

			int n;
			n = sc.nextInt();
			if (100000 < n || 9999 > n) {
				System.out.println("You entered not 5-digit number! Try again, please.");
			}

			else {
				int n1 = n / 10000;
				System.out.println(n1);
				int n2 = n % 10000 / 1000;
				System.out.println(n2);
				int n3 = n % 1000 / 100;
				System.out.println(n3);
				int n4 = n % 100 / 10;
				System.out.println(n4);
				int n5 = n % 10;
				System.out.println(n5);
				sc.close();
			}
		}
	}
}
