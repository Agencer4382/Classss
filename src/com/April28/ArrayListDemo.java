package com.April28;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	List<String> greetings=new ArrayList<String>();
	greetings.add("Hello");
	greetings.add("Welcome");
	greetings.add("Hi");
	greetings.add("Bye");

	System.out.println(greetings.get(1));
	System.out.println(greetings.size());//4
	
	//collection - growable in size
	greetings.add("How are you?");
	greetings.add("How are you?");
	greetings.add("How are you?");System.out.println(greetings.size());
	
	for(int i=0;i<greetings.size(); i++) {
		System.out.println(greetings.get(i));
	}
	
	for(String greetWords:greetings) {
		System.out.println(greetWords);
	}
	

	}

}

//mercedes,vw,bmw,mercedes,lexus
//
//2/1 -> 80
//2/2 -> 82
//2/3 -> 90
//
//ArrayList
//[mercedes,vw,bmw,mercedes,lexus]
//
//HashSet
//[mercedes,vw,bmw,lexus]
//		
//HashMap
//key->value
//2/1 -> 80
//2/2 -> 82
//2/3 -> 90
