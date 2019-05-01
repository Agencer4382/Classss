package com.April27;

public class Registration {
	private String email;
	private String userName;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.contains("@gmail")) {
		this.email = email;
	}
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (!userName.isEmpty()) {
			this.userName = userName;
	}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {

		if (!password.contains(userName) && !password.isEmpty() && password.length() > 6) {
			this.password = password;
	}
	}
}
