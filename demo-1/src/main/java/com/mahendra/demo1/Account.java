package com.mahendra.demo1;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account implements Serializable{
	
	private String accNum;
	private String kind;
	private double balance;
	
	public Account() {
		this.accNum = "0000";
		this.kind = "Savings";
		this.balance = 0D;
	}
	
	
	
	public Account(String accNum, String kind, double balance) {
		super();
		this.accNum = accNum;
		this.kind = kind;
		this.balance = balance;
	}



	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
