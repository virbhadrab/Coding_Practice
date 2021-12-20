package org.jspiders.abstractions.implementationLayer;

import org.jspiders.abstractions.interfacelayer.BankAccount;

public class SavingAccount implements BankAccount{
	double accountBalance;
	long accountNumber;
	String accountHolderName;
	
	public SavingAccount(double accountBalance, long accountNumber, String accountHolderName) {
		super();
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}

	@Override
	public void chechBalance() throws InterruptedException {
		System.out.println("Checkking Ammount From "+accountNumber);
		Thread.sleep(3000);
		System.out.println("Current Account Balance is "+accountBalance);
	}

	@Override
	public void deposit(int amount) throws InterruptedException {
		System.out.println("Ammount Depositing.....");
		Thread.sleep(5000);
		accountBalance+=amount;
		System.out.println(amount+" is Deposited Successfully....!");
	}

	@Override
	public void withdraw(int amount) throws InterruptedException {
		System.out.println("Ammount Withdrawing.....");
		Thread.sleep(5000);
		accountBalance-=amount;
		System.out.println(" "+amount+" is withdraw successfully from your Account ");
		System.err.println(this.accountHolderName);
	}

}
