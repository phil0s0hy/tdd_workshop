package com.bank.domain;

public class Account {
	private double balance;
	public Account(String id, double initialBalance) {
		this.balance = initialBalance;
	}
	
	public void deposit(double amount) throws InvalidDepositAmountException {
		if(amount <= 0)
			throw new InvalidDepositAmountException() ;
		this.balance += amount;
	}
	
	public double getBalance() {
		return balance;
	}
}