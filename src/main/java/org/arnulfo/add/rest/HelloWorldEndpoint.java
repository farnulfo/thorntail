package org.arnulfo.add.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldEndpoint {

    @GET
    @Produces("text/plain")
    public Response doGet() {
        return Response.ok("Hello from Thorntail!").build();
    }

    @GET
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public String add(
            @QueryParam("a") int a,
            @QueryParam("b") int b) {
        return String.format("{\"value\" : %d\"}", a + b);
    }
}
