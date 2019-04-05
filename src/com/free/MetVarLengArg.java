package com.free;

public class MetVarLengArg {

	public static void main(String[] args) {
System.out.println(average(30,53,22,50,99));
		
	}
	
	public static int average(int... is ) {
		int ttl=0;
		for(int x:is) 
			ttl+=x;
			
		return ttl/is.length;
		
	}

}
