package com.April13;

public class TaskShape {
	public void calculateArea (int a) {
		System.out.println("Area of Square "+a*4);
		
	}
	public void calculateArea (int a, int b) {
		System.out.println("Area of rectangle "+a*b);
	}
	public void calculateArea (int a, int b, int c) {
		System.out.println("Area of cube "+a*b*c);
	}
}
