package com.example.changeme.resources;

import com.example.changeme.views.ExampleView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Harry Scells on 26/02/2016.
 */
@Path("/")
public class ExampleViewResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public ExampleView fetch() {
        return new ExampleView();
    }

}
