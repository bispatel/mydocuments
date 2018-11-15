package com.restful.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/employee")
public class QueryParamExampleService {
 
    @GET
    @Path("/query")
    public Response getEmployeeQuery(@QueryParam("dept") String department,
                                    @QueryParam("branch") String branch){
        String resp = "Query parameters are received. 'dept' value is: "
                        +department+" and branch value is: "+branch;
         
        return Response.status(200).entity(resp).build();
    }
}