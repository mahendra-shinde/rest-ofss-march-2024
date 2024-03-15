package com.mahendra.demo4;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;


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
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON) /// Alternative to @Consumes("application/json")
	public Response create(Account acc) {
		try {
		dao.save(acc);
		return Response.ok("Created new account !").build();
		}catch(RuntimeException ex) {
			return Response.status(Status.BAD_REQUEST).entity(ex.getMessage()).build();
		}
	}
	
	@PUT
	@Path("/{id}")
	public Response update(@PathParam("id") Integer id,@RequestBody Account acc) {
		try {
			dao.update(id, acc);
			return Response.ok("Account Updated !").build();
			}catch(RuntimeException ex) {
				return Response.status(Status.BAD_REQUEST).entity(ex.getMessage()).build();
			}
	}
}	
