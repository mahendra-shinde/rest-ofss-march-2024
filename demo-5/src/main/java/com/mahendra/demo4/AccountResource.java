package com.mahendra.demo4;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

@Path("/account")
@Produces("application/json")
public class AccountResource {

	private AccountDAO dao = AccountDAO.getInstace();

	@GET
	@Path("/{id}")
	public Response findById(@PathParam("id") Integer id) {

		Account acc = dao.findById(id); // Method might throw an exception
		return Response.ok(acc).build();

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON) /// Alternative to @Consumes("application/json")
	public Response create(Account acc) {

		dao.save(acc);
		return Response.ok("Created new account !").build();

	}

	@PUT
	@Path("/{id}")
	public Response update(@PathParam("id") Integer id, @RequestBody Account acc) {

		dao.update(id, acc);
		return Response.ok("Account Updated !").build();

	}
}
