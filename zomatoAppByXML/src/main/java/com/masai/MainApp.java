package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	DeliveryService ds = ctx.getBean("did",DeliveryService.class);
	
	ds.showDeliveryDetails();
}
}
