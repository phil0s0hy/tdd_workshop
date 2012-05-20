package com.bank.domain;

import com.bank.domain.Account;
import org.junit.Test;


public class AccountTest {
	@Test
	public void depositTenUnit() {
		Account targetAccount = new Account("123456789", 50.0);
		targetAccount.deposit(10.00);
		assertThat(targetAccount.getBalance(), equalTo(60.00));
	}
}