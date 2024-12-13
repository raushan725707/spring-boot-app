package com.jenkins_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsDockerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDockerApplication.class, args);
	}


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JenkinsDockerApplication.class);
	}
}
