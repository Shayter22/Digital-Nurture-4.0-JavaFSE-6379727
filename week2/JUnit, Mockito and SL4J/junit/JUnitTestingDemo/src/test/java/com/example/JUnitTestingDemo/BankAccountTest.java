package com.example.JUnitTestingDemo;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount();  
    }

    @After
    public void tearDown() {
        account = null;
    }

    @Test
    public void testDeposit() {
        account.deposit(100);         
        assertEquals(100, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        account.deposit(200);
        account.withdraw(50);
        assertEquals(150, account.getBalance());
    }
}