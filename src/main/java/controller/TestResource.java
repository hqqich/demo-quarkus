package controller;


import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import server.TestService;

@Path("/test")
public class TestResource {

  @Inject
  TestService testService;

  @GET
  @Path("/hello")
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    return testService.hello();
  }
}
