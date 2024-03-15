package com.mahendra.demo4;

public class Account {

	private Integer accId;
	private String customer;
	private String type;
	private double amount;

	public Account() {

	}

	public Account(Integer accId, String customer, String type, double amount) {
		super();
		this.accId = accId;
		this.customer = customer;
		this.type = type;
		this.amount = amount;
	}

	public Integer getAccId() {
		return accId;
	}

	public void setAccId(Integer accId) {
		this.accId = accId;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
