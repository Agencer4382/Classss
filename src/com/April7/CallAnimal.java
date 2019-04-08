package com.April7;

public class CallAnimal {

	public static void main(String[] args) {


		Animal obj=new Animal();
		System.out.println("Dog age is "+obj.age);
		System.out.println("Animal breed is "+Animal.breed);
		System.out.println("Dog weigth is "+obj.weigth);
		System.out.println("Dog name is "+obj.name);
		
		System.out.println("Is dog wild "+obj.isWild());
		System.out.println("Dog can bark "+obj.canBark());
		
		Animal obj1=new Animal("joe");
		System.out.println("Dog age is "+obj1.age);
		System.out.println("Animal breed is "+Animal.breed);
		System.out.println("Dog weigth is "+obj1.weigth);
		System.out.println("Dog name is "+obj1.name);
		
		System.out.println("Is dog wild "+obj1.isWild());
		System.out.println("Dog can bark "+obj1.canBark());
	}

}
