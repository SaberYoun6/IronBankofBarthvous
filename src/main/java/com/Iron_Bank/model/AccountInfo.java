package com.Iron_Bank.model;

public class AccountInfo {
	private int accountId;
	private int transactionId;
	private String savingNumberId;
	private double debtSaving;
	private String checkingNumberId;
	private double debtChecking;

	public AccountInfo() {
		super();
	}
	public AccountInfo(int accountId) {
		this.accountId=accountId;
	}
	public AccountInfo(int accountId, String savingNumberId, String checkingNumberId) {
		this(accountId);
		this.savingNumberId=savingNumberId;
		this.checkingNumberId=checkingNumberId;
	}
	public AccountInfo(int accountId,String savingNumberId, double debtSaving ,String checkingNumberId, double debtChecking) {
			this(accountId,savingNumberId,checkingNumberId);
		    this.debtSaving=debtSaving;
			this.debtChecking=debtChecking;
	}
	
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getSavingNumberId() {
		return savingNumberId;
	}
	public void setSavingNumberId(String savingNumberId) {
		this.savingNumberId = savingNumberId;
	}
	public double getDebtSaving() {
		return debtSaving;
	}
	public void setDebtSaving(double debtSaving) {
		this.debtSaving = debtSaving;
	}
	public String getCheckingNumberId() {
		return checkingNumberId;
	}
	public void setCheckingNumberId(String checkingNumberId) {
		this.checkingNumberId = checkingNumberId;
	}
	public double getDebtChecking() {
		return debtChecking;
	}
	public void setDebtChecking(double debtChecking) {
		this.debtChecking = debtChecking;
	}
	
}
