package com.April23;

public abstract class Phone {
	public void makeCall() {
		System.out.println("Phone can make a call");
	}

	public void sendText() {
		System.out.println("Phone can make a send text");
	}

	public abstract void unlockPhone();

	public abstract void viewPictures();

}

class Iphone extends Phone {// concrete class - is class that is inherited from a abstract class
							// or implemented by interface and providing complete
							// implementation of all unimplemented/ abstract classes

	@Override
	public void unlockPhone() {
		System.out.println("To unlock iphone we can use face ID");

	}

	@Override
	public void viewPictures() {
		System.out.println("To view  pictures on iphone can go to images");

	}
}

class Samsung extends Phone {

	@Override
	public void unlockPhone() {
		System.out.println("To unlock samsung we can enter pin");

	}

	@Override
	public void viewPictures() {
		System.out.println("To view  pictures on samsung can go to gallery");

	}

}
