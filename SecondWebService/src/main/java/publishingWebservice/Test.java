package publishingWebservice;

import org.apache.tomcat.util.http.parser.MediaType;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/Class")
public class Test {

	
	@Path("/Message")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public void sayHi() {
		System.out.println("Hii- Hello\nExecuted Successfully!");
	}
	
	
}
