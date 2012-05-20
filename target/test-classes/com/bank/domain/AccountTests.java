package com.bank.domain;

import com.bank.domain.Account;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;


public class AccountTests {
	@Test
	public void depositTenUnit() {
		Account targetAccount = new Account("123456789", 50.0);
		targetAccount.deposit(10.00);
		assertThat(targetAccount.getBalance(), equalTo(60.00));
	}
	
	@Test
	public void depositTwebtyUnit() {
		Account targetAccount = new Account("123456789", 50.0);
		targetAccount.deposit(20);
		assertThat(targetAccount.getBalance(), equalTo(70.00));
	}
	
	@Test(expected=InvalidDepositAmountException.class)
	public void depositBelowZero() {
		Account targetAccount = new Account("123456789", 50.0);
		targetAccount.deposit(0);
		
	}
	
	
}