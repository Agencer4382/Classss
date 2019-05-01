package com.Test;

public class Array1 {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5,6,7,8,9,10 };
		int num = 0;

		for (int x : ar) {
			num += x;

		}
		System.out.println(num);
	}

}
