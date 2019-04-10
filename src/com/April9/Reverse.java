package com.April9;

public class Reverse {

	protected String reverse(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}

	public void isPalindrome(String str) {
		String rev = reverse(str);

		if (str.equals(rev)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}

	}

	private String[] words(String str) {
		return str.split(" ");
	}

	public static void main(String[] args) {
		Reverse obj = new Reverse();
		System.out.println(obj.reverse("hello"));
		obj.isPalindrome("radar");
		String []ary=obj.words("Hello World");
		for(String word:ary) {
			System.out.println(word);
			
		}

	}

}
