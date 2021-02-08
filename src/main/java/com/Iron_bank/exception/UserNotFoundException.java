package com.Iron_bank.exception;



public class UserNotFoundException extends Exception {
	
	public UserNotFoundException() {
		super();
	}
	public UserNotFoundException(String message) {
		super(message);
	}
	public UserNotFoundException(Throwable clause) {
		super(clause);
	}
	public UserNotFoundException(String message, Throwable clause) {
		super(message,clause);
	}
	public UserNotFoundException(String message ,Throwable clause, boolean enableSuppersion, boolean writeAbleStackTrace) {
		super(message,clause,enableSuppersion,writeAbleStackTrace);
	}
}
