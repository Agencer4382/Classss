package com.free;

public class Wed271 {

	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7, 8 } };

		for (int row = 0; row < num.length; row++) {

			for (int cols = 0; cols < num[row].length; cols++) {
				System.out.print(num[row][cols] + " ");
			}
			System.out.println();
		}
	}

}
