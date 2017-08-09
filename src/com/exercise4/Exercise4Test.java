package com.exercise4;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class Exercise4Test {
	
	Account account = new Account(25000);
	
	@Test(expected = InsufficientFundsException.class)
	public void withdrawTest() throws InsufficientFundsException {
		account.withdraw(50000);
	}

}
