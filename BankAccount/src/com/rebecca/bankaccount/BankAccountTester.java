package com.rebecca.bankaccount;

public class BankAccountTester {

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount(); 
		
		account1.deposit(100.00, "checking");
		account1.deposit(2000.00, "savings"); 
		account1.displayTotalBalance();
		System.out.println("Your checking account balance is: " + account1.getCheckingBalance()); 
		System.out.println("Your savings account balance is: " + account1.getSavingsBalance()); 
		
		System.out.println("The number of accounts at this bank is: " + BankAccount.getNumberOfAccounts());
		System.out.println("The total funding at this bank is: " + BankAccount.getTotalMoney()); 
		
		account1.withdrawl(20.00, "checking");
		account1.withdrawl(100.00, "checking");
		account1.withdrawl(100.00, "savings");
		
		account1.displayTotalBalance();
		System.out.println("The account number is: " + account1.getAccountNumber()); 
		
		
	}

}
