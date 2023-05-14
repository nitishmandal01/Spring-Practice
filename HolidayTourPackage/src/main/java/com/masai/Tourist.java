package com.masai;

public class Tourist {

	String name;
	int age;
	String aadhar_id;
	
	public Tourist(String name, int age, String aadhar_id) {
		super();
		this.name = name;
		this.age = age;
		this.aadhar_id = aadhar_id;
	}
	@Override
	public String toString() {
		return "Tourist [name=" + name + ", age=" + age + ", aadhar_id=" + aadhar_id + "]";
	}
	
	
}
