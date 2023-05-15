package com.masai;

public class MS_SQL implements Database{

	String URL;
	String username;
	String password;
	
	
	
	public void setURL(String uRL) {
		URL = uRL;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void MS_SQLConnection() {
		System.out.println("I'm in MS_SQL");
	}
	
	@Override
	public void getConnection() {
		MS_SQLConnection();
	}

}
