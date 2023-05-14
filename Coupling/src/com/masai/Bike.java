package com.masai;

public class Bike implements Vehicle{

	public void ride() {
		System.out.println("Riding Bike starts");
	}

	@Override
	public void go() {
		ride();
	}
}
