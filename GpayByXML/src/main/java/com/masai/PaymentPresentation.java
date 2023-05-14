package com.masai;

public class PaymentPresentation {
	TransactionService transactionservice;

	public void setTransactionservice(TransactionService transactionservice) {
		this.transactionservice = transactionservice;
	}
	
	 public void showTranscationDetails() {
		 transactionservice.calculateTransaction();
		 
		 //code to show transaction & account details
		 System.out.println();
	 }

}
