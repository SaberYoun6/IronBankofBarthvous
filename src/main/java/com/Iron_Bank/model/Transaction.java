package com.Iron_Bank.model;

public class Transaction {
	public Transaction() {
		super();
	}

	public Transaction(int transactionId,double debtSaving, double debtChecking) {
		super();
		this.transactionId=transactionId;
		this.debtSaving = debtSaving;
		this.debtChecking = debtChecking;

	}

	public Transaction(int transactionId,double debtSaving, double creditSaving, double debtChecking) {
		this(transactionId,debtSaving,debtChecking);
		this.creditSaving = creditSaving;
	}

	public Transaction(int transactionId,double debtChecking, float creditChecking, double debtSaving) {
		this(transactionId,debtSaving, debtChecking);
		this.creditChecking = creditChecking;
	}

	public double getDebtSaving() {
		return debtSaving;
	}

	public void setDebtSaving(double debtSaving) {
		this.debtSaving = debtSaving;
	}
	public double getDebtChecking() {
		return debtChecking;
	}

	public void setDebtChecking(double debtChecking) {
		this.debtChecking = debtChecking;
	}
	public double getCreditSaving() {
		return creditSaving;
	}
	public void setCreditSaving(double creditSaving) {
		this.creditSaving = creditSaving;
	}

	public double getCreditChecking() {
		return creditChecking;
	}

	public void setCreditChecking(double creditChecking) {
		this.creditChecking = creditChecking;
	}

	public int getTransactioId() {
		return transactionId;
	}

	public void setTransactioId(int transactioId) {
		this.transactionId = transactioId;
	}

	private int transactionId;
	private double debtSaving;
	private double creditSaving;
	private double debtChecking;
	private double creditChecking;

}
