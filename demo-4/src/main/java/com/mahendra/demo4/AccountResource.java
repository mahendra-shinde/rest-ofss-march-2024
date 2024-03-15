package com.mahendra.demo4;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


@Path("/account")
@Produces("application/json")
public class AccountResource {
	
	private AccountDAO dao = AccountDAO.getInstace();
	
	@GET
	@Path("/{id}")
	public Response findById(@PathParam("id") Integer id) {
		
		try {
		Account acc = dao.findById(id); // Method might throw an exception
		return Response.ok(acc).build();
		}catch(RuntimeException ex) {
			return Response.status(Status.NOT_FOUND).entity(ex.getMessage()).build();
		}
		
	}
}
