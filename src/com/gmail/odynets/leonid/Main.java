package com.gmail.odynets.leonid;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width: ");
		int width;
		width = sc.nextInt();
		System.out.println("Enter high: ");
		int high;
		high = sc.nextInt();
		System.out.println("Width: " + width + " and high: " + high);

		for (int i = 1; i <= high; i++) {
			for (int j = 1; j <= width; j++) {
				if (i == 1 || i == high) {
					System.out.print("*");
				} else if (j == 1 || j == width) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
