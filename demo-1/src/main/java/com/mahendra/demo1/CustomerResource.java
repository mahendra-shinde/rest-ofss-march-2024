package com.mahendra.demo1;

import javax.ws.rs.*;

@Path("/customers")
public class CustomerResource {

	@GET
	public String findCustomer() {
		System.out.println("Invoking GET method");	
		return "Not found!";
	}
	
	@POST
	public String saveCustomer() {
		System.out.println("Invoking POST method");
		return "Created a new customer";
	}
	
	@DELETE
	public String deleteCustomer() {
		System.out.println("Invoking DELETE method");
		return "Deleted a customer";
	}
}
