package com.restful.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/jersey")
public class RestJerseyExample {
	@GET
	@Path("/{message}")
	public Response publishRestEasyMessage(@PathParam("message") String msgStr) {
		String responseStr = "Received message: " + msgStr;
		return Response.status(200).entity(responseStr).build();
	}
	
	/*This is the default method. If URI pattern is /jersey, this method will be called*/
	@GET
    public Response pingMe(){     
        String defaultResp = "Hi... How are you?";
        return Response.status(200).entity(defaultResp).build();
    }
     
    @GET
    @Path("/birthday")
    public Response printBdayMessage(){         
        String bDayMessage = "Happy Birthday";
        return Response.status(200).entity(bDayMessage).build();
    }
    
    @GET
    @Path("{empId: [0-9]+}")
    public Response getEmployeeById(@PathParam("empId") String empId){         
        return Response.status(200).entity("Got employee with id : " + empId).build();
    }
     
    @GET
    @Path("/name/{empName: [a-zA-Z\\s]+}")
    public Response getEmployeeByName(@PathParam("empName") String name){
         
        return Response.status(200).entity("Got employee with name : " + name).build();
    }
}
