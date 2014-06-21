package org.sweatshop.hello.restApi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import lombok.Value;

@Path("/world")
public class HelloWorld {

    @Value
    private class HtmlTextObject {
        String text;
        
        public String toHtml() {
            return new StringBuilder()
            .append("<HTML><BODY>")
            .append(text)
            .append("</BODY></HTML>")
            .toString();
        }
    }
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response sayHtmlHello() {
        return Response.ok(new HtmlTextObject("Hello world!").toHtml()).build();
    }
}