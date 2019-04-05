package com.taskerd;

import java.util.Scanner;

public class Rep56 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] days = new String[7];

		for (int i = 0; i <= 6; i++) {

			System.out.println("Please enter day " + (i + 1) + " of the week : ");
			days[i] = sc.next();

		}
		for (int x = 0; x <= 6; x++) {
			System.out.println(days[x]);
		}

	}

}
