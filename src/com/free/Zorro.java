package com.free;

public class Zorro {

	public static void main(String[] args) {
		
		int row = 6;
		
		for(int i = 0; i<row; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		int spaces = row-1;
		for(int a = spaces; a >0; a--) {
			for(int i = a; i > 0;  i--) {
				System.out.print(" ");
			}
			System.out.println("*");
			
		}
		
		
		
		for(int i = 0; i<row; i++) {
			System.out.print("*");
		}
	

	}

}
