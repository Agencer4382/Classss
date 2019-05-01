package com.April23;

public class PhoneTest {

	public static void main(String[] args) {
		//Phone obj=new Phone(); can not instantiate phone class because it is an abstract class
		
		Phone obj= new Iphone();
		obj.makeCall();
		obj.sendText();
		obj.unlockPhone();
		obj.viewPictures();
		Phone obj1=new Samsung();
		obj1.makeCall();
		obj1.sendText();
		obj1.unlockPhone();
		obj1.viewPictures();
		

	}

}
