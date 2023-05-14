package com.masai;

public class OrderService {

	RestaurantService restaurantService;
 
	public void setRestaurantService(RestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}
	
	public void showOrderDetails() {
		restaurantService.showMenu();
		//code to select order from menu
		System.out.println("Here's the restaurent & order details");
	}
	
}
