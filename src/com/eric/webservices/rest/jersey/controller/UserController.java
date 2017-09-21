package com.eric.webservices.rest.jersey.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.eric.webservices.rest.jersey.model.User;
import com.eric.webservices.rest.jersey.service.UserService;

@Path("/users")
public class UserController {

	private UserService userService = new UserService();
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsers() {
		return userService.getAllUsers();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{param}")
	public User getUser(@PathParam("param") String uid) {
		return userService.getUser(Integer.valueOf(uid));
 
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public User addUser(User user) {
		return userService.addUser(user);
	}
	
	@DELETE
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public User delUser(@PathParam("param") String uid) {
		return userService.deleteUser(Integer.valueOf(uid));
	}
}