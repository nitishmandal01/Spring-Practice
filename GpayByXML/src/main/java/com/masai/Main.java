package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
			
			//pulling the object of PaymentPresentation Class
			PaymentPresentation pp = ctx.getBean("pid",PaymentPresentation.class);
			
			pp.showTranscationDetails();
	}

}
