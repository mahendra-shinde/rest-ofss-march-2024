package com.mahendra.demo2;

import java.util.Date;
import javax.ws.rs.*;

@Path("/loan")
@Produces({"application/json","application/xml"})
@Consumes({"application/json","application/xml"})
public class LoanResource {

	@GET
	@Path("/all")
	public Loan[] getLoans() {
		Loan[] loans = new Loan[2];
		loans[0]=new Loan("HL3445333","Atul Agnihotri",new Date(),6500000D, 160, 51000D);
		loans[1]=new Loan("HL3445433","Ajay Deol",new Date(),2200000D, 180, 29000D);
		
		return loans;
	}
	
	@GET
	public Loan findLoan() {
		return new Loan("HL3457863857","Ravi Shastri",new Date(),4500000D, 240, 38000D);
	}
}
