package com.rebecca.bankaccount;

import java.util.Random;

public class BankAccount {

//	The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance.
	private String accountNumber; 
	private double checkingBalance; 
	private double savingsBalance; 
	
//	Create a class member (static) that has the number of accounts created thus far.
	private static int numberOfAccounts = 0; 
//
//	Create a class member (static) that tracks the total amount of money stored in every account created.
	
	private static double totalMoney = 0; 
//
//	Create a private method that returns a random ten digit account number.
	
	private String generateAccountNumber() {
		Random num = new Random(); 
		String account = ""; 
		
		for (int i=0; i<10; i++) {
			int dig = num.nextInt(10); 
			account += dig; 
		}; 
		
		return account; 
	}
//
//	In the constructor, call the private method from above so that each user has a random ten digit account.
//
	public BankAccount() {
		this.setAccountNumber(this.generateAccountNumber()); 
		numberOfAccounts++; 
	}
//	In the constructor, be sure to increment the account count.
//
//	Create a getter method for the user's checking account balance.
//
//	Create a getter method for the user's saving account balance.
//
//	Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
//
	public void deposit(double amount, String accountType) {
		if(accountType == "savings") {
			this.setSavingsBalance(this.getSavingsBalance()+amount);
		} else if (accountType == "checking"){
			this.setCheckingBalance(amount+ this.getCheckingBalance());
		}; 
		
		totalMoney += amount; 
	}
//	Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
//
	public void withdrawl(double amount, String accountType) {
				
		if(accountType == "savings") {
			double balance = this.getSavingsBalance(); 
			if(balance < amount) {
				System.out.println("Insufficient Funds"); 
			} else {
				this.setSavingsBalance(this.getSavingsBalance()-amount);
				totalMoney -= amount; 
			}
		} else if (accountType == "checking"){
			double balance = this.getCheckingBalance(); 
			if(balance < amount) {
				System.out.println("Insufficient Funds"); 
			}else {
				this.setCheckingBalance(this.getCheckingBalance()-amount);
				totalMoney-= amount; 
			}
		};
	}
//	Create a method to see the total money from the checking and saving.
//
	public void displayTotalBalance() {
		double total = this.getCheckingBalance() + this.getSavingsBalance(); 
		System.out.printf("Your total balance from Checking and Savings is $%.2f.", total); 
	}
//	Users should not be able to set any of the attributes from the class.

	public String getAccountNumber() {
		return accountNumber;
	}

	private void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	private void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	private void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}


	public static double getTotalMoney() {
		return totalMoney;
	}
}
