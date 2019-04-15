package com.April14;

public class Addition {
	//1.overloading methods by changing number of parameters
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a) {
		System.out.println(a+100);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	//2.overloading methods by changing the data type of parameters
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	public void add(int a, double b) {
		System.out.println(a+b);
	}

}
