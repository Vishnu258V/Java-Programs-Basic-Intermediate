package com.ATM_Program;

import java.util.*;
// deposit, withdraw, balance check,exit

class DisplayOptions {

	// instance block
	{
		System.out.println("-----------------------------------------");
		System.out.println("Choose the number for specific operation ");
		System.out.println("1- BALANCE ENQUIRY\t\t2- CASH DEPOSIT");
		System.out.println("3- CASH WITHDRAW\t\t4- Exit");
	}

}

class Attributes {

	private double balance = 50000;
	private double deposit;
	private int withdraw;
	int exit;

	// Getters
	public double getBalance() {
		return balance;
	}

	public double getDeposit() {
		return deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	// Setters
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
}

// This class is about the functions that are going to perform
class Operations {
	Attributes a1 = new Attributes();
	Scanner sc = new Scanner(System.in);

	public void BalanceCheck() {
		System.out.println("\nBalance = " + a1.getBalance());
	}

	public void Deposit() {
		System.out.println("\nEnter the Amount to deposit ");
		double deposit = sc.nextDouble();
		a1.setBalance(a1.getBalance() + deposit);
		System.out.println("\nTotal Balance = " + a1.getBalance());
	}

	public void Withdraw() {
		System.out.println("\nEnter the Amount to Withdraw ");
		int withdraw = sc.nextInt();

		if (withdraw <= 20000) {

			if (withdraw <= a1.getBalance() && withdraw % 100 == 0) {
				a1.setBalance(a1.getBalance() - withdraw);
				System.out.println("\nPlease Collect your Money\nRemaining Balance = " + a1.getBalance());
			} else {
				System.out.println("\nEnter the amount in 100s ");
			}
		} else if (withdraw > a1.getBalance()) {
			System.out.println("\nInsufficent Funds ");
		} else {
			System.out.println("\nDaily Limit Exceeding ");
		}
	}

	public void Exit() {
		System.out.println("\nThank you for visiting ");
	}

}

// Main Method
public class AtmFunctions {
	public static void main(String[] args) {

		DisplayOptions dis = new DisplayOptions();
		Operations op = new Operations();

		Scanner sc = new Scanner(System.in);
		int functionNum = sc.nextInt();

		if (functionNum == 1) {

			op.BalanceCheck();
		} else if (functionNum == 2) {

			op.Deposit();
		} else if (functionNum == 3) {

			op.Withdraw();
		} else if (functionNum == 4) {

			op.Exit();
		} else {
			System.out.println("\nChoose the correct Operation Number  ");
		}

	}
}
