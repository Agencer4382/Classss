package com.Yalcin;

public class Working {

	public static void main(String[] args) {
		Working obj = new Working();
		obj.evenOdd(14);
		obj.isPalindrome("Radar");
		obj.isPrime(100);

	}

	public void evenOdd(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is even");

		} else {
			System.out.println(a + " is odd");
		}

	}

	public void isPalindrome(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println(str + " is palindrome");
		} else {
			System.out.println(str + " is not palindrome");
		}
	}

	public void isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i < 10; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}

		}
		if (isPrime) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + " is not prime number");
		}
	}

}
