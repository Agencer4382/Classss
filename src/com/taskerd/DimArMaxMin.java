package com.taskerd;

public class DimArMaxMin {

	public static void main(String[] args) {
		int[][] num = { { 10, 4, 45, 5 }, { 32, 75 }, { 21 } };

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int row = 0; row < num.length; row++) {

			for (int col = 0; col < num[row].length; col++) {

				int current_value = num[row][col];

				if (current_value > max) {
					max = current_value;

				}

				if (current_value < min) {
					min = current_value;

				}

			}

		}

		// System.out.println(min);
		// System.out.println(max);
	}

}
