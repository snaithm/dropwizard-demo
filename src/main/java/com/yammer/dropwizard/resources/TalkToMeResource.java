package com.yammer.dropwizard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by snaithm on 02/03/17.
 */

@Path("/talk/{number}")
public class TalkToMeResource {

    @GET
    public String getStatus(@PathParam("number") int n){

        try {
            if (n < 0) return "Hello, your number has been recognised as less than zero";
            else if (n > 0 && n < 101) return "Hi, your number is greater than zero but less than 100";
            else return "Welcome, the number you have entered is greater than 100";
        }
        catch (Exception e) {
            return "Your input has returned an error, please try again";
        }
    }
}
