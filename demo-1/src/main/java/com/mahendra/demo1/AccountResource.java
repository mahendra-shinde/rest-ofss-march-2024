package com.mahendra.demo1;

import javax.ws.rs.*;

@Path("/account")
@Produces({"application/json","application/xml"})
public class AccountResource {

	@GET
	public Account findAccount() {
		System.out.println("Account ");
		return new Account();
	}
	
	@GET
	@Path("/all")
	public Account[] findAll() {
		Account[] accs = new Account[5];
		for(int i=0;i<5;i++) {
			accs[i] = new Account("Ac1111"+(int)Math.random(),"Savings",1200*Math.random());
		}
		return accs;
	}
	
	@POST
	@Consumes("application/json")
	public Account save(Account account) {
		System.out.println("Creating new account "+account.getAccNum()+" "+account.getKind());
		return account;
	}
}
