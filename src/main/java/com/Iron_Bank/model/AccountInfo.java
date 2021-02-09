package com.Iron_Bank.model;

public class AccountInfo {
	private int accountId;
	private String numberId;
	private double debt;
	private String accountType;

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

	public AccountInfo(int accountId,String accountType,String numberId, double debt) {
			this(accountId,accountType,numberId);
		    this.debt=debt;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
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

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
