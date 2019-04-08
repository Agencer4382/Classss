package com.April7;

public class Application {

	public static void main(String[] args) {
		
		Human person1=new Human();
		person1.eyeColor="pink";
		
		
		System.out.println(person1.eyeColor);
		System.out.println(person1.height);
		System.out.println(person1.weight);
		
		
		int my_arry[]={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(Minmun.minOfValue(my_arry));
		
		Claculater num=new Claculater();
		System.out.println(num.sum(15, 10, 5));
		System.out.println(num.average(15, 10, 5));
		System.out.println(num.max(15, 10, 5));
		//System.out.println(num.min(15, 10, 5));

	}

}
