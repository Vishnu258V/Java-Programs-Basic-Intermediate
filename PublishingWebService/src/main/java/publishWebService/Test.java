package publishWebService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("Demo")
public class Test {
	
	@Path("hi")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public void sayHi() {
		System.out.println("Hii- Hello\nExecuted Successfully!");
	}
}
