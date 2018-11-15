package com.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

//@Path("/resteasy")
public class RestEasyExample {
	//@GET
	//@Path("/{message}")
	public Response publishRestEasyMessage(@PathParam("message") String msgStr) {
		String responseStr = "Received message: " + msgStr;
		return Response.status(200).entity(responseStr).build();
	}
}
