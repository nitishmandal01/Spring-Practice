package com.masai;

public class GmailUser {
	EmailReader er;
	EmailSender es;
	EmailOrganizer eo;
	
		public void readEmails(){
			//here it needs EmailReader Dependency
			System.out.println("Reading emails...");
			//Use execute(), getStatus(), stopOperation() of EmailReader
		}
		
		public void sendEmails(){
			//here it needs EmailSender Dependency
			System.out.println("Sending emails...");
			//Use execute(), getStatus(), stopOperation() of EmailSender
		}
		
		public void organizeEmails(){
			//here it needs EmailOrganizer Dependency
			System.out.println("Organizing emails...");
			//Use execute(), getStatus(), stopOperation() of EmailOrganizer
		}
}
