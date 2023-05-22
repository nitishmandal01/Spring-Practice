package com.masai.twitter.Entity;

public class User {
	private String userId;
	private String name;
	private String email;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userId, String name, String email) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
	}
	public String getUserid() {
		return userId;
	}
	public void setUserid(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userid=" + userId + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
