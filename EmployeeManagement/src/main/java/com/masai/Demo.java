package com.masai;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	
	private Map<Department, Employee> theMap;
	
	public void myInit(){
		System.out.println("inside init method");
	}
	
	public void cleanUp() {
		System.out.println("inside destroy method");
	}
	

	public Map<Department, Employee> getTheMap() {
		return theMap;
	}

	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}

	public void showDetails() {
		System.out.println("inside show method of Demo");
		System.out.println(theMap);
	}

	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Demo demo =  ctx.getBean("demo",Demo.class);
		demo.showDetails();
		
		 ClassPathXmlApplicationContext ctx2 =  (ClassPathXmlApplicationContext)ctx;
		 
		 ctx2.close();
	}
}
