package com.April13;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		System.out.println("I am a constructor with no parameters");
	}
	ConstructorOverloading(String str){
		System.out.println("I am a constructor with string parameters");
	}
	ConstructorOverloading(String str,String str1){
		System.out.println("I am a constructor with 2 string parameters");
	}
	ConstructorOverloading(int a){
		System.out.println("I am a constructor with integer parameters");
	}

}
