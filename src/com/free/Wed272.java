package com.free;

public class Wed272 {

	public static void main(String[] args) {
		
		
		int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };
		int count=0;
		
		for(int[]i:rating) {
			for(int element:i) {
				if(element>6) {
					count++;
				}
				
			}
		}
		System.out.println(count);
	}

}
