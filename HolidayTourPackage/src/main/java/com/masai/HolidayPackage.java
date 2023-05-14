package com.masai;


public class HolidayPackage {

	String package_name;
	Tourist tourist;
	String package_expiry;
	int package_price;
	
	public void showDetails() {
		System.out.println(package_name+" "+package_expiry+" "+package_price);
		System.out.println("Tourist details:- " + tourist.toString());
	}

	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}

	public void setTourist(Tourist tourist) {
		this.tourist = tourist;
	}

	public void setPackage_expiry(String package_expiry) {
		this.package_expiry = package_expiry;
	}

	public void setPackage_price(int package_price) {
		this.package_price = package_price;
	}


	
	
}
