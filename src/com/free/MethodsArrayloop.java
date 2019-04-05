package com.free;

public class MethodsArrayloop {

	public static void main(String[] args) {

		int[][] fary = { { 4, 5, 6, 7, }, { 12, 13, 14 }, { 25 } };
		int[][] sary = { { 30, 31, 32 }, { 45 }, { 50, 52, 54 } };

		System.out.println("The first fary is : ");
		display(fary);

		System.out.println("The second sary is : ");
		display(sary);
		
		int toplam;
		toplam = sum(3, 6);
		System.out.println(toplam);

	}

	public static void display(int x[][]) {

		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[row].length; col++) {
				System.out.print(x[row][col] + "\t");

			}
			System.out.println();
		}
	}

	public static int sum(int a, int b) {
		return a + b;
	}
}
