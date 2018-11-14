package com.coffee.core;

public class User {

	private String userCode;

	private String username;

	private String password;

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userCode=" + userCode + ", username=" + username
				+ ", password=" + password + "]";
	}

}
