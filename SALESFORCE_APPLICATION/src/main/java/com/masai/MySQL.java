package com.masai;

public class MySQL implements Database{

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

	public void MYSQLConnection() {
		System.out.println("I'm in MYSQL");
	}
	
	@Override
	public void getConnection() {
		MYSQLConnection();
	}

}
