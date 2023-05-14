package com.masai;

public class Main {

	public static void main(String[] args) {
		//Constructor INjection
//		Travel tr = new Travel(new Bike());
		
		//Setter Injection
		Travel tr = new Travel();
		tr.setV(new Bike());
		
		tr.journey();
	}

}
