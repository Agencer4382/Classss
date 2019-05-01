package com.April9;

public class Reverse {
	private String name="Jhon";
	String name1="Bilal";
	protected String name2="asha";

	protected String reverse(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}

	public boolean isPalindrome(String str) {
		String rev = reverse(str);

		if (str.equals(rev)) 
			return true;
		else return false;

	}

	private String[] words(String str) {
		return str.split(" ");
	}
	

	public static void main(String[] args) {
		Reverse obj = new Reverse();
		System.out.println(obj.reverse("hello"));
		System.out.println(obj.isPalindrome("radar"));
		String []ary=obj.words("Hello World");
		for(String word:ary) {
			System.out.println(word);
			
		}

	}

}
