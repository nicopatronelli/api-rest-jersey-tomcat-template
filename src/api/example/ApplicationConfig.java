package api.example;

import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationConfig extends ResourceConfig {
	public ApplicationConfig() {
		this.register(new ApplicationBinder());
		this.packages(true, "api.example");
	}
}