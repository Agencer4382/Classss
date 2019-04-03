package com.April2;

public class Dog {
	
	String kind, color;
	int size,speed;

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		
		dog.kind="Husky";
		dog.color="brown";
		dog.size=1;
		dog.speed=25;
		
		dog.run();
		dog.play();
		dog.jump();
		
		Dog dog1=new Dog();
		
		dog1.kind="Bulldog";
		dog1.color="black";
		dog1.size=2;
		dog1.speed=40;
		
		dog1.run();
		dog1.play();
		dog1.jump();
		
		Dog dog2= new Dog();
		
		dog2.kind="Labrador";
		dog2.color="Grey";
		dog2.size=2;
		dog2.speed=55;
		
		dog2.run();
		dog2.play();
		dog2.jump();
		

	}
	void run(){
		System.out.println(kind+" dog can  run fast.");
	}void play(){
		System.out.println(kind+" dog can play really well.");
	}void jump(){
		System.out.println(kind+" dog can jump.");
	}

}
