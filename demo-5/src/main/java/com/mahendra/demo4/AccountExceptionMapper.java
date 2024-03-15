package com.mahendra.demo4;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider /// An optional PLUG-IN for JAX-RS
public class AccountExceptionMapper implements ExceptionMapper<RuntimeException>{

	@Override
	public Response toResponse(RuntimeException ex) {
		return Response.status(Status.BAD_REQUEST).entity(ex.getMessage()).build();
	}
	
}
