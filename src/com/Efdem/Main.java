package com.Efdem;

public class Main {

	static String makeString(String s1, String s2) {
		String temp="";
		for(int i=0; i<s1.length(); i++) {
			temp=temp+s1.charAt(i)+s2.charAt(i);
			
		}
		return temp;
		
	}
	public static void main(String []args) {
		
		System.out.println(Main.makeString("kale", "123456"));
	}
	}
	
	