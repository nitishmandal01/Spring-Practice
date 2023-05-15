package com.masai;

public class Oracle implements Database{
	
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

	public void OracleConnection() {
		System.out.println("I'm in Oracle");
	}
	
	@Override
	public void getConnection() {
		OracleConnection();
	}
}
