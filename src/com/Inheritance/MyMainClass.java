package com.Inheritance;

class OuterC{
	int x=10;
	
	class InnerC{
		int y=10;
	}
	
}
public class MyMainClass {

	public static void main(String[] args) {
		OuterC num1=new OuterC();
		OuterC.InnerC sum=num1.new InnerC();
		System.out.println(num1.x+sum.y);
		

	}

}
