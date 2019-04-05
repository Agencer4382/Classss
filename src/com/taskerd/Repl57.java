package com.taskerd;

import java.util.Scanner;

public class Repl57 {

	public static void main(String[] args) {

		int[] years = new int[11];

		for (int i = 0; i <= 10; i++) {

			years[i] = 2010 + i;

		}
		for (int x = 0; x <= 10; x++) {
			System.out.println(years[x]);

		}
	}

}
