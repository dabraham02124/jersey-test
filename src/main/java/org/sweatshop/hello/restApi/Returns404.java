package org.sweatshop.hello.restApi;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/return-404")
public class Returns404 {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response sayHtmlHello() {
        return Response.status(Response.Status.NOT_FOUND).entity("foo").build();
    }

}
