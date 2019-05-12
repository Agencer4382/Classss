package com.May11;

public class UncheckedException {

	public static void main(String[] args) {
		int[]ary= {11,12,13};
		System.out.println(ary[3]);//ArrayIndexOutOfBoundsException
		
		String a="Hello";
		System.out.println(a.charAt(5));//ArrayIndexOutOfBoundsException
	}

}
