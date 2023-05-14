package com.masai;

public class Travel {
Vehicle v;

//	public Travel (Vehicle v) {
//		this.v = v;
//	}
	

	
public void journey() {
	v.go();
	System.out.println("Journey started");
}

public void setV(Vehicle v) {
	this.v = v;
}
}
