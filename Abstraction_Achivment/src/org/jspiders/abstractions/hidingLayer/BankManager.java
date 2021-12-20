package org.jspiders.abstractions.hidingLayer;

import org.jspiders.abstractions.implementationLayer.LoneAccount;
import org.jspiders.abstractions.implementationLayer.SavingAccount;
import org.jspiders.abstractions.interfacelayer.BankAccount;

public class BankManager {
	
	public BankAccount openAccount(char typeOfBankAccount, double accountBalance, long accountNumber, String accountHolderName) {
		
		BankAccount a = null;
		if (typeOfBankAccount == 'S') {
			a = new SavingAccount(accountBalance, accountNumber, accountHolderName);
			return a;
		}
		else if (typeOfBankAccount == 'L') {
			a = new LoneAccount(accountBalance, accountNumber, accountHolderName);
			return a;
		}
		return a;
	}
}
