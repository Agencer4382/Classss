package com.Inheritance;

public class Animal {
	
	String breed="Mamal";
	public void animalSound() {
		System.out.println("The animal make sound.");
	}


	public static void main(String[] args) {
		Animal obj=new Animal();
		System.out.println(obj.breed);
		obj.animalSound();
		
		Animal cat=new Cat();
		cat.animalSound();
	
		
		Animal dog=new Dog();
		dog.animalSound();
		
	}
}
