package com.April9;

public class TryTest {

	protected String reverse(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);

		}
		return rev;
	}

	public boolean palindrome(String str) {
		String rev = reverse(str);

		if (rev.equals(str))
			return true;
		else
			return false;

	}

	private String[] aryOfString(String str) {
		return str.split(" ");

	}

	void isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i < 10; i++) {
			if (num % 2 == 0) {
				isPrime = false;
				break;

			}
		}
		if (isPrime) {
			System.out.println(num + " prime number");
		} else {
			System.out.println(num + " is not prime number");
		}

	}

	public static void main(String[] args) {
		TryTest obj = new TryTest();
		System.out.println("String reverse = " + obj.reverse("Hello"));
		System.out.println(obj.palindrome("kabak"));
		
		String[] ary = obj.aryOfString("Hello world this java coding.");
		
		for (String word : ary) {
			System.out.println(word);
			
		}
		obj.isPrime(25);

	}

}
