package com.free;

public class MethodsTaskAry {

	public static void main(String[] args) {

		MethodsTaskAry num1 = new MethodsTaskAry();
		int[] ary = { 100, 155, 200, 20, 9, -5 };
		num1.maxAndMin(ary);
		int[] ary2 = { 10, 5655, -43, 5435, -9, 0 };
		num1.maxAndMin(ary2);

	}

	    static 
	    void maxAndMin(int[] ary) {
		int max = Integer.MIN_VALUE;
		int max2 = 0;
		int min = Integer.MAX_VALUE;
		int min2 = 0;
		
		for (int x = 0; x < ary.length; x++) {

			if (ary[x] > max) {
				max2 = max;
				max = ary[x];

			} else if (ary[x] > max2 && ary[x] != max) {
				max2 = ary[x];
			}
			if (ary[x] < min) {
				min2 = min;
				min = ary[x];
			} else if (ary[x] > min2 && ary[x] != min) {

			}

		}
		System.out.println("Array max number = " + max);
		System.out.println("Array max2 number = " + max2);
		System.out.println("Array min number = " + min);
		System.out.println("Array min2 number = " + min2);

	}

}
