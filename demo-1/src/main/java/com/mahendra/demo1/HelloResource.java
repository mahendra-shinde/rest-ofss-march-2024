package com.mahendra.demo1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
/// REST Endpoint: http://localhost:8080/demo-1/hello
public class HelloResource {

	@GET
	public String sayHello() {
		System.out.println("Client did not mention expected response type !");
		return "Hello World";
	}
	
	@GET 
	@Produces("application/json")
	public String sayHelloJSON() {
		System.out.println("Client expected response type JSON !");
		return "{'message':'Hello World' }";
	}
	
	@GET 
	@Produces("application/xml")
	public String sayHelloXML() {
		System.out.println("Client expected response type XML !");
		return "<message>Hello WOrld</message>";
	}
	
}
