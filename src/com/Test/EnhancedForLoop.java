package com.Test;

public class EnhancedForLoop {

	public static void main(String[] args) {

		int kevin[] = {1,2,3,4};
		int num = 0;

		for (int x : kevin) {
			num += x;

		}
		System.out.println(num);
	}

}
