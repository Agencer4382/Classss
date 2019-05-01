package com.April13;

public class CallingStaticVsNonStatic {

	public static void main(String[] args) {
		
		StaticVsNonStatic obj=new StaticVsNonStatic();
		System.out.println(obj.name);
		//access static members by using calssNamethey belong to
		System.out.println(StaticVsNonStatic.lastName);
		StaticVsNonStatic.getInfo1();
			

	}

}
