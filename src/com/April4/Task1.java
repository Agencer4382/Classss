package com.April4;

public class Task1 {

	public static void main(String[] args) {
		Task1 num = new Task1();
		num.evenOdd(8);
		num.isPalindrome("kabak");

	}

	void evenOdd(int a) {

		if (a % 2 == 0) {
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");

		}

	}

	void isPalindrome(String str) {
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
	}
}
