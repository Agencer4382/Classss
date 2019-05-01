package com.April13;

public class StaticVsNonStatic {
	public String name="John";
	public static String lastName="Snow";

	public static void main(String[] args) {
		StaticVsNonStatic obj=new StaticVsNonStatic();
		obj.getInfo();
		getInfo1();//within same class we can call it by using method /veriable name
		
		System.out.println(lastName);
		System.out.println(obj.name);

	}//no static ver. can acess both instance and static
	public void getInfo() {
		System.out.println("My name is name "+name+" and my last name is "+lastName);
	}//static method only aces. satatic ver
	public static void getInfo1() {
		//System.out.println("My name is name "+name+" and my last name is "+lastName);
		//will get error 
		System.out.println("I am a static method");
		//getInfo();// we cannot access  
		
	}

}
