package com.April20;

public class ThisWithConstructor {
	
	ThisWithConstructor() {
		System.out.println("I have no parameters");
	}
	ThisWithConstructor(String str){
		this();
		System.out.println("I have 1 string parameters "+str);
	}
	ThisWithConstructor(String str1, String str2){
		this(str1);
		System.out.println("I have 2 string parameters "+str1+" "+str2);
	}
	ThisWithConstructor(String str1, String str2, String str3){
		this(str1,str2);
		System.out.println("I have 3 string parameters "+str1+" "+str2+" "+str3);
	}
	public static void main(String[] args) {
//		
		ThisWithConstructor obj=new ThisWithConstructor("a","b","c");
		
		
	}

}
