package org.banco.server.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ComponentScan(basePackages = { ModuleConfiguration.BASE_PACKAGE })
@EnableAutoConfiguration
@EnableEurekaServer
public class ModuleConfiguration {

	public static final String BASE_PACKAGE = "org.banco.server";

}
