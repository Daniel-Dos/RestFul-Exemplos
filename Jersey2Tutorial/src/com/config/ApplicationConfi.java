package com.config;

import org.glassfish.jersey.server.ResourceConfig;

import com.controller.StudentController;

public class ApplicationConfi extends ResourceConfig {
	
	public ApplicationConfi() {
	register(StudentController.class);
	}

}
