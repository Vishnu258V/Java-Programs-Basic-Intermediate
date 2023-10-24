package FirstOne.WebService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/Class")
public class FirstClass {

	@GET
	@Path("/Message")
	@Produces(MediaType.TEXT_PLAIN)
	public String  sayHi() {
		return "i am done with this";
	}
	
	
	
}
