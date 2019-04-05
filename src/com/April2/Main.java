package com.April2;

public class Main {

	String breed,name,color;


	public static void main(String[] args) {
		Main dog=new Main();
		 
		dog.breed="Husky";
		dog.name="pop";
		dog.color="brown";
		
		dog.burk();
		dog.run();
		dog.play();
		
		Main dog1=new Main();
		dog1.breed="Bulldog";
		dog1.name="Kol";
		dog.color="Black";
		
		dog1.burk();
		dog1.run();
		dog1.play();
		
		Main dog2=new Main();
		dog2.breed="Labrador";
		dog2.name="Kol";
		dog2.color="Black";
		
		dog2.burk();
		dog2.run();
		dog2.play();
		
		
		 
	}
	void burk(){
		System.out.println(breed+" can bark");
		
	}
	void run() {
		System.out.println(breed+" can run");
		
	}
	void play() {
		System.out.println(breed+" can play");
	}

}
