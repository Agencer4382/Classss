package com.April11;

public class Dog {
	
	 static String breed ="Husky";
	 static int paws=4;
	 String name;
	 int weight;
	 int height;
	 
	 public static void main(String []args) {
		 Dog dog1=new Dog();
		 Dog dog2=new Dog();
		 Dog dog3=new Dog();
		 
		 dog1.name="Mardy";
		 dog1.weight=60;
		 dog1.height=40;
		 dog1.getDogProperties();
		 
		 dog2.name="Waffle";
		 dog2.weight=50;
		 dog2.height=30;
		 dog2.getDogProperties();
		 
		 breed="Pug";
		 dog3.name="Lucy";
		 dog3.weight=30;
		 dog3.height=20;
		 dog3.getDogProperties();
		 System.out.println(Dog.breed);
	 }
	 
	 public void getDogProperties() {
		 System.out.println(name+" is a breed of "+breed+" and weigth is "+weight+" and height is "+height);
	 }
	 

}
