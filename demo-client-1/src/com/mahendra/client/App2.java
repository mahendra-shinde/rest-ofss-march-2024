package com.mahendra.client;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import org.apache.cxf.jaxrs.client.WebClient;

public class App2 {

	public static void main(String[] args) {
		WebClient client = WebClient.create("http://localhost:8084/demo-5");
		
		Response resp = client.path("/account/1031").accept(MediaType.APPLICATION_JSON).get();
		
		if(resp.getStatus()==200) {
			Account acc = resp.readEntity(Account.class);
			System.out.println("Account found : "+acc.getCustomer()+" "+acc.getAccId());
		}else {
			System.out.println("Error : "+resp.readEntity(String.class));
		}
		
		client.close();
	}

}
