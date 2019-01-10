package ru.home;

import java.util.Scanner;

public class Snowball {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int weight = scan.nextInt();
		int height = scan.nextInt();
		int stoun1Weight = scan.nextInt();
		int stoun1Height = scan.nextInt();
		int stoun2Weight = scan.nextInt();
		int stoun2Height = scan.nextInt();

		while (height != 0) {

			weight = weight + height;
			if (height == stoun1Height) {
				weight = weight - stoun1Weight;
				System.out.println("stoune 1 " + weight);
			}
			if (height == stoun2Height) {
				weight = weight - stoun2Weight;
				System.out.println("stoune 2 " + weight);
				if (weight <= 0) {
					weight = 0;
					System.out.println("<0 " + weight);
				}
				System.out.println("iteration " + weight);
			}
			height = height - 1;
		}
		System.out.println(weight);
	}
}
