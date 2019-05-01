package com.April25;

public interface ITakesScreenshot {
	String fileExtension=".png";// by default public static final variable and  it must be initialized
	void takesScreenshot();
	
	//from java 8 we can have defined methods in interface : static or default
	 static void m1() {
		 System.out.println("Static m1 method");
	 }
	 default void m2() {
		 System.out.println("Default m2 method");
	 }

}
