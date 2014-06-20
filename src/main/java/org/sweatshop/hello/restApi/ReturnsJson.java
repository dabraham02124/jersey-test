package org.sweatshop.hello.restApi;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import lombok.Value;

@Path("/return-json")
public class ReturnsJson {

    @Value
    private class InnerReturnObject {
        String innerFoo;
        String innerBar;
    }
    @Value
    private class ReturnObject {
        String foo;
        String bar;
        List<String> list = Arrays.asList("foo", "bar", "baz");
        InnerReturnObject iro = new InnerReturnObject("iFoo", "iBar");
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayHtmlHello() {
        return Response.ok(new ReturnObject("alpha", "beta")).build();
    }
}
