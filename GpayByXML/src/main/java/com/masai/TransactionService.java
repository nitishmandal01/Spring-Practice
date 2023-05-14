package com.masai;

public class TransactionService {

	AccountDetailsDAO accountDetailsdao;


	public void setAccountDetailsdao(AccountDetailsDAO accountDetailsdao) {
		this.accountDetailsdao = accountDetailsdao;
	}



	public void calculateTransaction() {
		accountDetailsdao.getAccountDetails();
		
		//code to calculate the transaction fees
		System.out.println("Transaction fee updated");
	}
}
