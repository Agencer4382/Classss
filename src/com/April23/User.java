package com.April23;

public class User {
	String name;
	long mobileNumber;
	
	public User(String name, long mobileNumber) {
		
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	

}
class UserInfo extends User{

	public UserInfo(String name, long mobileNumber, String address) {
		super(name, mobileNumber);
		System.out.println("User name "+name+" mobile number "+mobileNumber+" address "+address);
		
	}
	public static void main(String[] args) {
		UserInfo obj= new UserInfo("jhon",5304556090L,"Alpine,nj");
		
	}
	
}
