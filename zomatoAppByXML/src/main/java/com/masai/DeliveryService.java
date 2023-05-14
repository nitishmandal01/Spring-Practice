package com.masai;

public class DeliveryService {

	OrderService orderService;

	
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	public void showDeliveryDetails() {
		orderService.showOrderDetails();
		
		//code for delivery details based on orders
		System.out.println("All details for Delivery of order");
	}
	
}
