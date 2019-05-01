package com.Test;

public class NestedLoopRow {

	public static void main(String[] args) {


		for (int x = 1; x <=4; x++) {
			for (int y = 1; y <=6; y++) {

				if (x == 1 || x == 4 || y == 1 || y == 6) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();

		}

	}

}
