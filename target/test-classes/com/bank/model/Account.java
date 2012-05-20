package com.bank.model;

import com.bank.domain.Account;
import orh.junit.Test;


public class Account {
	@Test
	public void depositTenUnit() {
		Account targetAccount = new Account("123456789", 50);
		targetAccount.deposit(10.00);
		assertThat(targetAccount.geetBalance(), equalTo(60.00));
	}
}