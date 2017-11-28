package com.basra.game.resources;

/**
 * Created by Ortal on 11/22/2017.
 */

import com.basra.game.services.UserServices.UserAuthenticationService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/user")
public class userRestResource {

    UserAuthenticationService service ;

    @GET
    @Path("checkuser/{userID}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response checkUser(@PathParam("userID") String userID) {
        service = new UserAuthenticationService(userID);
        service.execute();
        return service.getResponse();
    }
}
