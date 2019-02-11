package org.banco.server;

import org.banco.server.configuration.ModuleConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ModuleConfiguration.class).run(args);
	}
}
