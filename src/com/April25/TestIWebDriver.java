package com.April25;

public class TestIWebDriver {

	public static void main(String[] args) {
		IWebDriver obj=new ComDriver();
		obj.closeBrowser();
		obj.findElement();
		obj.maximizeWindow();
		obj.openBrowser();
		obj.m2();
		obj.takesScreenshot();
		ITakesScreenshot.m1();//static method we can access with interface name
	
		
		IWebDriver obj1=new FireFoxDriver();
		obj1.closeBrowser();
		obj1.findElement();
		obj1.maximizeWindow();
		obj1.openBrowser();
		

	}

}
