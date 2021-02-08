package com.itm510.lab01;
/* Class to implement deposit withdrawal and computation of Monthly Interest rate*/
public class AccountHolder {

	private double balance;
	static double annualInterestRate;

	public AccountHolder() {

	}

	public AccountHolder(double balance) {
		this.balance = balance;
	}

	public void deposit(double depositAmt) {
		// updating current balance with deposit money.
		balance = balance + depositAmt;
	}

	public void withdrawal(double withdrawalAmt) {
		// Error Trapping -- checking the balance to see if it falls below threshold balance of $50.
		if (balance < 50) {
			System.err.println("Sorry for inconvinience. The Balance in your account should hold at least $50");
		} else if ((balance - withdrawalAmt) < 50) {
			System.err.println("Sorry for inconvinience. The Balance in your account should hold at least $50");

		} else if (withdrawalAmt >= balance) {
			System.err.println("Sorry for inconvinience. The Balance in your account should hold at least $50");

		} else {
			balance = balance - withdrawalAmt;

		}
	}

	public void monthlyinterest() {
		// Computation of monthly balance by applying interest rate.
		balance += balance * (annualInterestRate / 12.0);
		System.out.format("$%.2f", balance);

	}

}
