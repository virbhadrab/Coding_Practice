package org.jspiders.abstractions.utilizationLayer;

import java.util.Scanner;

import org.jspiders.abstractions.hidingLayer.BankManager;
import org.jspiders.abstractions.interfacelayer.BankAccount;

public class AccountCration {

	public static void main(String[] args) throws InterruptedException {
		BankAccount ba = null;
		boolean status = true;

		double accountBalance;
		long accountNumber;
		String accountHolderName;

		System.err.println("Wait System Load....");
		Thread.sleep(5000);

		BankManager b = new BankManager();

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose Your Transection Account \n \t 1. Saving Account \n \t 2. Lone Account \n \t 3. EXIT \n");
		

		while (status!=false) {
			System.out.println("Enetr the Chooise..");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				char ch = 'S';
				System.out.println("Enter Initial Account Balance \n");
				accountBalance = sc.nextDouble();

				System.out.println("Enetr Unique Account Number \n");
				accountNumber = sc.nextLong();

				System.out.println("Enetr Account Holder Name \n");
				accountHolderName = sc.next();

				ba = b.openAccount(ch, accountBalance, accountNumber, accountHolderName) ;
				int key;
				System.out.println("Choose The Fuction \n \t 1.Check Balance \n \t 2.Deposit Ammount \n \t 3.Withdraw Ammount \n \t 4.EXIT \n");
				
				boolean value = true;
				while (value!=false) 
				{	System.out.println("Enetr the transaction Chooise");
					key = sc.nextInt();
					switch (key) {
					case 1:
						ba.chechBalance();
						break;
					case 2:
						System.out.println("Enetr the Deposit Ammount \n");
						int ammount = sc.nextInt();
						ba.deposit(ammount);
						break;
					case 3:
						System.out.println("Enetr the Withdrw Ammount \n");
						int ammount2 = sc.nextInt();
						ba.withdraw(ammount2);
						break;
					case 4: 
						value = false;
						break;
					default:
						System.out.println("You Have Entered WRONG Chooise...");
						break;
					}
				}
				break;
			case 2:
				char ch1 = 'L';
				System.out.println("Enter Initial Account Balance ");
				accountBalance = sc.nextDouble();

				System.out.println("Enetr Unique Account Number ");
				accountNumber = sc.nextLong();

				System.out.println("Enetr Account Holder Name ");
				accountHolderName = sc.next();

				ba = b.openAccount(ch1, accountBalance, accountNumber, accountHolderName) ;
				int key1;
				System.out.println("Choose The Fuction \n \t 1.Check Balance \n \t 2.Deposit Ammount \n \t 3.Withdraw Ammount \n \t 4.EXIT \n");
				
				boolean value1 = true;
				while (value1!=false) 
				{	System.out.println("Enetr the transaction Chooise");
					key1 = sc.nextInt();
					switch (key1) {
					case 1:
						ba.chechBalance();
						break;
					case 2:
						System.out.println("Enetr the Deposit Ammount \n");
						int ammount = sc.nextInt();
						ba.deposit(ammount);
						break;
					case 3:
						System.out.println("Enetr the Withdrw Ammount \n");
						int ammount2 = sc.nextInt();
						ba.withdraw(ammount2);
						break;
					case 4:
						value1 = false;
						break;
					}
				}
				break;
			case 3:
				status = false;
				break;
			default:
				System.out.println("You Entered WRONG Chooise...");
				break;
			}
		}
		System.err.println("System Shut Down wait.......!");
		Thread.sleep(5000);
		System.err.println("DONE......!!!");	
		sc.close();
	}

}