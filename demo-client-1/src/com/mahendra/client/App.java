package com.mahendra.client;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;

public class App {

	public static void main(String[] args) {
		WebClient client = WebClient.create("http://localhost:8084/");
		
		Response resp = client.path("/demo-1/hello").accept(MediaType.APPLICATION_JSON).get();
		
		System.out.println(resp.getStatus()+" "+resp.readEntity(String.class));
		
		client.close();

	}

}
