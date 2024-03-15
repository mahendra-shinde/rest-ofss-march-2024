package com.mahendra.demo1;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class AppConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
		resources.add(HelloResource.class);
		resources.add(CustomerResource.class);
		resources.add(AccountResource.class);
		return resources;
	}
}
