package com.mahendra.demo4;

import java.util.LinkedList;
import java.util.List;

public class AccountDAO {

	// Code Snippet : Singleton pattern
	private static AccountDAO instance = build();
	
	private static AccountDAO build() {
		return new AccountDAO();
	}
	
	public static AccountDAO getInstace() {
		return instance;
	}
	// Code snippet ends !
	
	List<Account> accounts = new LinkedList<>();
	
	private AccountDAO() {
		accounts.add(new Account(1001,"Rajiv Bhatia","SB",1200));
		accounts.add(new Account(1002,"Vishal Devgan","SB",2300));
		accounts.add(new Account(1003,"Vijay deol","CB",2500));
	}
	
	public void save(Account acc) {
		if(existsById(acc.getAccId())) {
			throw new RuntimeException("Cant create new accunt, account with this id already exists!");
		}
		accounts.add(acc);
	}
	
	
	public void update(int accId, Account newAcc) {
		
		if(!existsById(accId)) {
			throw new RuntimeException("Cant update non-existing account !");
		}
		Account acc = findById(newAcc.getAccId()); 
		acc.setAmount(newAcc.getAmount());
		acc.setCustomer(newAcc.getCustomer());
		acc.setAmount(newAcc.getAmount());
	}
	
	public Account findById(int accId) {
		if( !existsById(accId)) {
			throw new RuntimeException("Account does not exists !");
		}
		for(Account a : accounts) {
			if(a.getAccId()==accId)
				return a;
		}
		return null;
	}
	
	public boolean existsById(int accId) {
		for(Account a : accounts) {
			if(a.getAccId()==accId)
				return true;
		}
		return false;
	}
	
}
