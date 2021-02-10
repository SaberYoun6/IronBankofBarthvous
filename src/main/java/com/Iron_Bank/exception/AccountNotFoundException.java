package com.Iron_Bank.exception;

public class AccountNotFoundException  extends Exception{
	
	public AccountNotFoundException() {
		super();
	}
	public AccountNotFoundException(String message) {
		super(message);
	}
	public AccountNotFoundException(Throwable clause) {
		super(clause);
	}
	public AccountNotFoundException(String message, Throwable clause) {
		super(message,clause);
	}
	public AccountNotFoundException(String message, Throwable clause
			,boolean enableSuppersion, boolean writeAbleStackTrace) {
		super(message,clause,enableSuppersion,writeAbleStackTrace);
	}

}
