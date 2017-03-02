package com.yammer.dropwizard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by snaithm on 02/03/17.
 */

@Path("/greeting/{name}")
public class HelloWorldResource {

    @GET
    public String getGreeting(@PathParam("name") String name){
        return "Hello " + firstToUpper(name) + "!!";
    }

    public String firstToUpper(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
