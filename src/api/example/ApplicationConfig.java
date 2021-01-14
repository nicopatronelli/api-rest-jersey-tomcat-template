package api.example;

import org.glassfish.jersey.server.ResourceConfig;

// ResourceConfig extiende de javax.ws.rs.Application
public class ApplicationConfig extends ResourceConfig {
	public ApplicationConfig() {
		this.register(new ApplicationBinder());
		this.packages(true, "api.example");
	}
}