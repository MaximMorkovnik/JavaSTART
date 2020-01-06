package com.gmail.morkovnik.maxim;

import java.util.Scanner;

public class Dz102 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first side of the triangle and press Enter");
		double a = sc.nextInt();
		System.out.println("Input the second side of the triangle and press Enter");
		double b = sc.nextInt();
		System.out.println("Input the third side of the triangle and press Enter");
		double c = sc.nextInt();

		double p = (a + b + c) / 2;
		double x = p * (p - a) * (p - b) * (p - c);
		double s = Math.sqrt(x);
		System.out.println("The area of a triangle = " + s);
		sc.close();
	}
}
