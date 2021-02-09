package com.Iron_Bank.model;

public class AccountInfo {
	private int accountId;
	private int accountNumberId;
	private String accountType;
	private String numberId;
	private double debt;
	
	public AccountInfo() {
		super();
	}

	public AccountInfo(int accountId) {
		this.accountId = accountId;
	}

	public AccountInfo(int accountId, String accountType, String numberId) {
		this(accountId);
		this.numberId = numberId;
	}
	public AccountInfo(int accountId, int accountNumberId) {
		this(accountId);
		this.accountNumberId = accountNumberId;
	}

	public AccountInfo(int accountId,String accountType,String numberId, double debt) {
			this(accountId,accountType,numberId);
		    this.debt=debt;
	}

	public AccountInfo(int accountId, int accountNumberId, String accountType, String numberId, double debt) {
		super();
		this.accountId = accountId;
		this.accountNumberId = accountNumberId;
		this.accountType = accountType;
		this.numberId = numberId;
		this.debt = debt;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getAccountNumberId() {
		return accountNumberId;
	}

	public void setAccountNumberId(int accountNumberId) {
		this.accountNumberId = accountNumberId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getNumberId() {
		return numberId;
	}

	public void setNumberId(String numberId) {
		this.numberId = numberId;
	}

	public double getDebt() {
		return debt;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}

	
}
