package com.masai;

public class EmailReader {
	
	
	public void execute(){
		System.out.println("Receiving email...");
	}

	public String getStatus(){
		return "Email received";
	}

	public void stopOperation(){
		System.out.println("Email receiving stopped");
	}
}
