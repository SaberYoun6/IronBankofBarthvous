package com.Iron_bank.exception;

public class DataBaseConnectionException extends Exception {

	public DataBaseConnectionException() {
		super();
	}
	public DataBaseConnectionException(String message , Throwable clause,boolean enabledSupression,
		boolean writeableStackTrace) {
		super(message,clause,enabledSupression,writeableStackTrace);
	}
	public DataBaseConnectionException(String message, Throwable cause ) {
		super(message,cause);
	}
}
