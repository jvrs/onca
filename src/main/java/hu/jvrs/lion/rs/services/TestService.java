package hu.jvrs.lion.rs.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

@Path("/hello")
public class TestService {
	private static final Logger LOG4JLOGGER = Logger.getLogger(TestService.class.getSimpleName());

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		LOG4JLOGGER.info(">>>> getMsg started.. >>>>");
		String output = "Jersey say : " + msg;

		return Response.status(200).entity(output).build();
	}
}
