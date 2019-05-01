package com.April6;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		ScannerMethod obj = new ScannerMethod();
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
		int b = sc.nextInt();

		obj.sum(100, 74);
		obj.sum(a, b);
		obj.sub();
		obj.sub();
		System.out.println(obj.sum(5, 7));

	}

	public int sum(int x, int y) {
		return x + y;

	}

	public int mult(int x, int y) {
		return x * y;

	}

	public int div(int x, int y) {
		return x / y;

	}

	public int sub1(int x, int y) {
		return x - y;

	}

	void sub() {
		int a = 10, b = 12;
		System.out.println(a + b);
	}
}
