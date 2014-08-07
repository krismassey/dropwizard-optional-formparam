package com.github.krismassey.dropwizard;

import com.google.common.base.Optional;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/optional-param/")
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.TEXT_PLAIN)
public class OptionalParamResource {
    @POST
    public String show(@FormParam("id") Optional<String> id) {
        return id.toString();
    }
}