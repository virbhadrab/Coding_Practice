package org.jspiders.abstractions.interfacelayer;

public interface BankAccount {
	void chechBalance() throws InterruptedException;
	void deposit(int amount) throws InterruptedException;
	void withdraw(int amount) throws InterruptedException;
}
