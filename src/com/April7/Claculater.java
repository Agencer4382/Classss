package com.April7;

public class Claculater {

	public static void main(String[] args) {

	}

	public int sum(int x, int y, int z) {

		return x + y + z;

	}

	public int average(int x, int y, int z) {
		return (x + y + z) / 3;

	}

	public int max (int x,  int y, int z) {
		if(x>y&&x>z) {
			return x;	
		}
		if (y>x&&y>z) {
			return y;
			
		}
		return z;
		
		
		
	}

}
