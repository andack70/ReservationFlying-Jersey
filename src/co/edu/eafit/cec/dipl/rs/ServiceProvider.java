package co.edu.eafit.cec.dipl.rs;

import org.glassfish.jersey.server.ResourceConfig;

public class ServiceProvider extends ResourceConfig{
	public ServiceProvider() {
		packages("co.edu.eafit.cec.dipl.rs");
	}
}
