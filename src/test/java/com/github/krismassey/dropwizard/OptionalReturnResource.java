package com.github.krismassey.dropwizard;


import com.google.common.base.Optional;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/optional-return/")

@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.TEXT_PLAIN)
public class OptionalReturnResource {
    @POST
    public Optional<String> show(@FormParam("id") String id) {
        return Optional.fromNullable(id);
    }
}
