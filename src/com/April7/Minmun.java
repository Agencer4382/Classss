package com.April7;

public class Minmun {
	
	static int minOfValue(int []x) {
		int min=Integer.MAX_VALUE;
		for(int y:x) {
			
			if(y<min) {
				min=y;
			}
		}
		return min;
	}

}
