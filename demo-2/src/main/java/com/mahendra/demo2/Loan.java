package com.mahendra.demo2;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *     loanAccNum string
    customerName string
    disbursedOn date
    disbursedAmt double
    duration int (months)
    emi double
 */

@XmlRootElement
public class Loan implements Serializable{
	
	private String loanAccNum;
	private String customerName;
	private Date disbursedOn;
	private double disbursedAmt;
	private int duration;
	private double emi;
	public String getLoanAccNum() {
		return loanAccNum;
	}
	public void setLoanAccNum(String loanAccNum) {
		this.loanAccNum = loanAccNum;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getDisbursedOn() {
		return disbursedOn;
	}
	public void setDisbursedOn(Date disbursedOn) {
		this.disbursedOn = disbursedOn;
	}
	public double getDisbursedAmt() {
		return disbursedAmt;
	}
	public void setDisbursedAmt(double disbursedAmt) {
		this.disbursedAmt = disbursedAmt;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Loan(String loanAccNum, String customerName, Date disbursedOn, double disbursedAmt, int duration,
			double emi) {
		super();
		this.loanAccNum = loanAccNum;
		this.customerName = customerName;
		this.disbursedOn = disbursedOn;
		this.disbursedAmt = disbursedAmt;
		this.duration = duration;
		this.emi = emi;
	}

}
