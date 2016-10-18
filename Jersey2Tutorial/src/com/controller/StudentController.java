package com.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.entity.Student;

@Path("Services")
public class StudentController {
	
	@POST
	@Path("/changeName")
	@Produces(MediaType.APPLICATION_XML)
	public Student changeName(Student student) {
		student.setName("HELLO" + student.getName());
		return student;
	}
	
	@GET
	@Path("/getName")
	@Produces(MediaType.APPLICATION_XML)
	public Student getName() {
		Student student = new Student();
		student.setName("Daniel Dias");
		return student;
	}
	
	@POST
	@Path("/changeNameJson")
	@Produces(MediaType.APPLICATION_JSON)
	public Student changeNameJson(Student student) {
		student.setName("HELLO" + student.getName());
		return student;
	}
	
	@GET
	@Path("/getNameJson")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getNameJson() {
		Student student = new Student();
		student.setName("Daniel Dias");
		return student;
	}
	
}
