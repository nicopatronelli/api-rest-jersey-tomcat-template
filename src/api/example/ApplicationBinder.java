package api.example;

import org.glassfish.jersey.internal.inject.AbstractBinder;

public class ApplicationBinder extends AbstractBinder {
	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		this.bind(Raichu.class).to(Raichu.class);
	}
}
