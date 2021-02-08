package com.itm510.lab01;

import java.util.Scanner;

/*Test class for AccountHolder class that allows
 * testing of methods: Deposit, Withdrawal, Balance check  */
public class AccountHolderTest {
	public static void main(String[] args) {

		double balance, withdrawalamt, depositAmt;
		AccountHolder.annualInterestRate = 0.04;
		Scanner sc = new Scanner(System.in);
		System.out.println("       !  WELCOME TO BANK ATM OF IIT CHICAGO !  ");
		System.out.println("Please enter the initial balance to your account:");
		balance = sc.nextDouble();

		/* if (balance < 0)
		 throw new IllegalArgumentException("Please reenter a non-negative balance to your account.");*/
		while (balance < 0) {
			System.err.println("!!Invalid input. Please reenter positive initial balance greater than $50.\n");
			balance = sc.nextDouble();
		}
		AccountHolder accHolderObj = new AccountHolder(balance);

		System.out.println("Please enter the amount to be Deposited: ");
		depositAmt = sc.nextDouble();
		accHolderObj.deposit(depositAmt);

		System.out.println("Please enter the money to be Withdrawn: ");
		withdrawalamt = sc.nextInt();
		accHolderObj.withdrawal(withdrawalamt);

		System.out.println("Your ending balance with MonthlyInterest Rate of 4% is: ");
		accHolderObj.monthlyinterest();
		System.out.println("\n      Thank You For Visiting Our ATM (^o^). Have a Great Time Ahead.     ");
		sc.close();

	}
}
