package com.itm510.lab01;
import java.util.Scanner;

public class AccountHolderTest12 {
	public static void main(String[] args) {

		double balance, withdrawalamt, depositAmt;
		AccountHolder.annualInterestRate = 0.04;

		Scanner sc = new Scanner(System.in);
		System.out.println("ATM Machine");
		System.out.println("Enter the initial balance to your account");
		balance = sc.nextDouble();

		AccountHolder accHolderObj;
		while (balance < 50) {
			System.out.println("\\!!Invalid input. Please reenter positive initial balance greater than $50.\\n");
			balance = sc.nextDouble();
		}

		/*
		 * if (balance < 0.0) throw new IllegalArgumentException(
		 * "!!Invalid input. Please reenter positive initial balance greater than $50.\\n"
		 * );
		 */
		accHolderObj = new AccountHolder(balance);

		int n = 0;
		while (true) {
			System.out.println("   ! Welcome to the ATM service  !");
			System.out.println("Please enter the operation from below to proceed");
			System.out.println("1: Please enter money to be deposited");
			System.out.println("2: Please enter withdrawal amount");
			System.out.println("3: Ending Balance with monthly Interest of 0.04%");
			System.out.println("4: Exit");

			n = sc.nextInt();
			switch (n) {

			case 1:
				System.out.println("Deposit amount:");
				depositAmt = sc.nextDouble();
				accHolderObj.deposit(depositAmt);
				break;
			case 2:
				System.out.println("Withdrawal amount:");
				withdrawalamt = sc.nextInt();
				accHolderObj.withdrawal(withdrawalamt);
				break;
			case 3:
				System.out.println("Balance : ");
				accHolderObj.monthlyinterest();
				System.out.println("");
				break;
			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("Incorrect Details..Please try again later");

			}
			
		}
	
	}

}
