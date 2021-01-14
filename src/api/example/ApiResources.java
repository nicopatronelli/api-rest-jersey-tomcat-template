package api.example;

import java.time.LocalDateTime;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class ApiResources {
	
	private Raichu raichu;
	
	@Inject
	public ApiResources(Raichu raichu) {
		this.raichu = raichu;
	}

	@GET
	@Path("/hello")
	public String greeting() {
		return "Hello World!";
	}
	
	@GET
	@Path("/time")
	public String getTime() {
		return LocalDateTime.now().toString();
	}
	
	@GET
	@Path("/pikachu")
	@Produces(MediaType.APPLICATION_JSON)
	public Pokemon getPikachu() {
		return new Pokemon(25, "pikachu");
	}
	
	@GET
	@Path("/raichu")
	@Produces(MediaType.APPLICATION_JSON)
	public Raichu getRaichu() {
		return this.raichu;
	}
	
}
