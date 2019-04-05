package com.free;

public class Wed274 {

	public static void main(String[] args) {
		// find the third col.numbers average---->(9,9,6,2)
		int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };

		double sum=0;
		
		for(int row=0; row<rating.length; row++) {
			sum+=rating[row][2];
			
			
		}
		System.out.println(sum/rating.length);
	}

}
