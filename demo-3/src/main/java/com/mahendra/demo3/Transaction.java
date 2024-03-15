package com.mahendra.demo3;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transaction {

	private String transactionId;
	private Date date;
	private String fromAccount;
	private String toAccount;
	private String particulars;
	private double amount;
	
	public Transaction() {
		super();
	}
	
	public Transaction(String transactionId, Date date, String fromAccount, String toAccount, String particulars,
			double amount) {
		super();
		this.transactionId = transactionId;
		this.date = date;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.particulars = particulars;
		this.amount = amount;
	}

	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
