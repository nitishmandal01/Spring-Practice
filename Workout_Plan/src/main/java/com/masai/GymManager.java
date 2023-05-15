package com.masai;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GymManager {
	private Map<WorkoutProgram, Member> gymPrograms;
	
	public void setGymPrograms(Map<WorkoutProgram, Member> gymPrograms) {
		this.gymPrograms = gymPrograms;
	}

	public void initialize() {
		System.out.println("inside initialize init method...");
	}
	
	public void shutDown() {
		System.out.println("inside shutdown - destory method");
	}
	
	
	public void displayDetails() {
		System.out.println("inside display method of GymManager");
		System.out.println(gymPrograms);
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		GymManager gm = ctx.getBean("gm",GymManager.class);
		
		gm.displayDetails();
		
		ClassPathXmlApplicationContext ctx2  = (ClassPathXmlApplicationContext)ctx;
		
		ctx2.close();
		
	}
}
