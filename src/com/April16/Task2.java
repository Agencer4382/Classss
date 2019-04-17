package com.April16;

public class Task2 {

	public static void main(String[] args) {
		Task2.num();
		Task2.num(10);
		Task2.num(5, 4);

	}

	static void num() {
		System.out.println(0);

	}

	static void num(int a) {
		System.out.println(a);

	}

	static void num(int b, int a) {
		System.out.println(a+b);

	}

}
