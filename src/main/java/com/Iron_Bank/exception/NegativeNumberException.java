package com.Iron_Bank.exception;

public class NegativeNumberException extends Exception{
	public NegativeNumberException() {
		super();
		
	}
	public NegativeNumberException(String message) { 
		super(message);
	}
	public NegativeNumberException(Throwable clause) {
		super(clause);
	}
	public NegativeNumberException(String message, Throwable clause) {
		super(message, clause);
	}
	public NegativeNumberException(String message, Throwable clause, 
			boolean enableSuppersion, boolean writeAbleStackTrace) {
		super(message,clause,enableSuppersion, writeAbleStackTrace);
	}
}
