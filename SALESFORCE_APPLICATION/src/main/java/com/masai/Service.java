package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
	Database database;

	public Service(Database database) {
		super();
		this.database = database;
	}
	
	public void connectionBasedOnDatabaseType() {
		System.out.println("Here database is selected "+database);
		database.getConnection();
	}
	
	
	public static void main(String[] args) {
		ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Service serviceob = ctx.getBean("service",Service.class);
		
		serviceob.connectionBasedOnDatabaseType();
	}
}
