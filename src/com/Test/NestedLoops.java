package com.Test;

public class NestedLoops {

	public static void main(String[] args) {
		
		for (int x=1; x<=5; ++x) {
			
			
			for(int y=1; y<=2; ++y) {
				
				System.out.println("x = "+x+"; y = "+y);
			}
			System.out.println("Outer loop iteration "+x);
		}

	}

}
