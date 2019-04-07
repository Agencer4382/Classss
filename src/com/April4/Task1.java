package com.April4;

public class Task1 {

	public static void main(String[] args) {
		Task1 num = new Task1();
		num.evenOdd(8);
		num.isPalindrome("kabak");
		num.isPrime(10);
		num.fibanocciNum(0, 1, 0);
		

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

	void isPrime(int number) {
		boolean isPrime = true;
		for (int i = 2; i < 10; i++) {

			if (number % 2 == 0) {
				isPrime = false;
				break;
			}

		}
		if (isPrime) {
			System.out.println(number + " is prime number.");

		} else {
			System.out.println(number + " is not prime number.");
		}
	}

	void fibanocciNum(int a, int b, int c) {
		System.out.print(a + " + " + b + " + ");

		for (int i = 1; i < 10; i++) {

			c = a + b;
			a = b;
			b = c;
			
			System.out.print(c + " + ");
		}
		
	}
	
		
		
	}

