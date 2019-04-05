package com.free;

public class Wed273 {

	public static void main(String[] args) {

		int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };

		double sum = 0;
		double average = 0;

		for(int i=0; i<rating[3].length; i++) {
			
			sum+=rating[3][i];
			
			average=sum/rating[3][i];
			

		}
		System.out.println(average);

	}
	

}
