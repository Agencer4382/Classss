package com.April25;

public interface IWebDriver extends ITakesScreenshot {
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
	

}
class ComDriver extends Browser implements IWebDriver, Report{

	@Override
	public void openBrowser() {
		System.out.println("Opening chrome browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing chrome browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximizing chrome browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find element in chrome browser");
		
	}

	@Override
	void refreshBrowser() {
	System.out.println("Refresh chrome browser");
		
	}

	@Override
	public void getReport() {
		System.out.println("Report from chrome browser");
		
	}

	@Override
	public void takesScreenshot() {
		System.out.println("Taking screenshot chrome browser");
		
	}
	
}
class FireFoxDriver extends Browser implements IWebDriver,Report{

	@Override
	public void openBrowser() {
		System.out.println("Opening  firefox browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing firefox  browser ");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximizing firefox browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find element in firefox browser");
	}

	@Override
	void refreshBrowser() {
		System.out.println("Refresh firefox browser");
		
	}

	@Override
	public void getReport() {
		System.out.println("Report from firefox browser");
		
	}

	@Override
	public void takesScreenshot() {
		System.out.println("Taking screenshot firefox browser");
		
	}
	
}
