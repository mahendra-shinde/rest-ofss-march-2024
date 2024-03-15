package com.mahendra.demo3;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/transactions")
@Produces("application/xml")
public class TransactionResource {

	List<Transaction> transactions = new LinkedList<>();

	public TransactionResource() {
		transactions.add(new Transaction("TR1234", new Date(), "SB16863876", "CA2836876", "Transfer", 12000));
		transactions.add(new Transaction("TR1235", new Date(), "SB16863876", "SB1535367", "NEFT", 2000));
		transactions.add(new Transaction("TR1236", new Date(), "SB16863821", "Cash", "Self", 5000));
	}
//	@GET
//	public Transaction findTransaction() {
//		return new Transaction("TR1234", new Date(), "SB16863876", "CA2836876", "TRansfer", 12000);
//	}

//	@GET
//	public String findTransactions(@QueryParam("type") String type){
//		return "Your parameter value was "+type;
//	}
//
//	@GET
//	@Path("/{type}") //Value of @Path and @PathParam MUST match 
//	public String findTransactions(@PathParam("type") String type) {
//		return "Your parameter value was " + type;
//	}
	
	@GET
	public List<Transaction> findTransactions(@QueryParam("fromacc") String fromAcc){
		List<Transaction> temp = new LinkedList<Transaction>();

		if(fromAcc == null || fromAcc.trim().length() < 0) {
			return temp;
		}
		
		for(Transaction t : transactions) {
			if(t.getFromAccount().equalsIgnoreCase(fromAcc)) {
				temp.add(t);
			}
		}
		return temp;
	}
	
	@GET 
	@Path("/{tranId}")
	public Response findTransaction(@PathParam("tranId") String tin) {
		for(Transaction t : transactions) {
			if(t.getTransactionId().equalsIgnoreCase(tin)) {
				// Return SUCCESS response
				//Response resp = Response.ok(t).build();
				Response resp = Response.status(210).entity(t).header("msg", "Record found").build();
				return resp;
			}
		}
		// Should return ERROR !
		return Response.status(459).entity("Sorry, The transaction does not exists !").build();
	}	
//	
//	@GET 
//	@Path("/{tranId}")
//	public Transaction findTransaction(@PathParam("tranId") String tin) {
//		for(Transaction t : transactions) {
//			if(t.getTransactionId().equalsIgnoreCase(tin))
//				return t;
//			}
//		return null;
//	}	
}

