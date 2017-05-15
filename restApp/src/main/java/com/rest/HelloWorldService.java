package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldService {

	@GET
	@Path("/{param}")
	@Produces(MediaType.TEXT_HTML)
	public String getMsg(@PathParam("param") String msg) {

		String output = "Jersey say : " + msg;

		return output;

	}
}
