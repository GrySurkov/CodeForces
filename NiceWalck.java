package ru.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// http://codeforces.com/problemset/problem/1090/M?csrf_token=932a9702078992fe1860474b7789584c

public class NiceWalck {

	public static void main(String[] args) throws IOException {
		int n, k;
		int homeCounter = 0;
		int maxHomeCounter = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String snk = reader.readLine();
		StringTokenizer pars = new StringTokenizer(snk, " ");
		n = Integer.parseInt(pars.nextToken());
		k = Integer.parseInt(pars.nextToken());
		String sStreet;
		sStreet = reader.readLine();
		int[] street = new int[n];
		StringTokenizer parser = new StringTokenizer(sStreet, " ");
		for (int j = 0; parser.hasMoreTokens(); j++) {

			street[j] = Integer.parseInt((parser.nextToken()));

		}
		for (int i = 0; i != street.length; i++) {
			System.out.print(street[i] + " ");
		}
		System.out.println(" ");

		for (int i = 1; i < street.length; i++) {
			// System.out.println("проверка элементов: " + i + " и " + (i - 1));
			if (street[i] != street[i - 1]) {
				// System.out.println("Ёлементы " + i + " и " + (i - 1) + " не равны");
				homeCounter = homeCounter + 1;
				if (maxHomeCounter < homeCounter) {

					maxHomeCounter = homeCounter;
					// System.out.println("ћаксимальное значение переназначино");
				}
			} else {
				// System.out.println("Ёлементы " + i + " и " + (i - 1) + " равны");
				homeCounter = 0;
			}
		}
		System.out.println(maxHomeCounter + 1);

	}

}
