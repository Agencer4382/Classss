package com.taskerd;

public class Quiz {

	public static void main(String[] args) {
		// --------------------------->>>>>5-2-I like Java Programming Language-124
		if (true) {
			int[] str = { 5 };
			String i = "" + str[0];
			System.out.print(i);
		}
		System.out.print("-");
		{
			int[] str = { 1, 2 };
			System.out.print(str[1]);
		}
		System.out.print("-");
		{
			String str = "I like Java Programming Language";
			System.out.print(str);
		}
		System.out.print("-");
		{
			int str = 124;
			System.out.print(str);
		}
		// ------------------------------>>>>10,100,50
		int i = 50;

		int[] a = new int[10];
		System.out.println(a.length);

		a = new int[100];
		System.out.println(a.length);

		a = new int[i];
		System.out.println(a.length);
		// ----------------------------->>>>>>>>4
		int[] ab = { 12, 15, 11, 13, 9, 25 };
		int[] a2 = { 12, 15, 11, 13, 9, 25 };
		int sumTtl = 0;
		for (int x = 0; x < a.length; x++) {
			if (ab[x] % 2 == a2[x] % 5) {
				sumTtl += x * x;
			}
		}
		System.out.println("sum = " + sumTtl);

	}

}
