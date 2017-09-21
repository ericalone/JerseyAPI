package com.eric.webservices.rest.jersey.service;

import java.util.ArrayList;
import java.util.List;

import com.eric.webservices.rest.jersey.model.User;

public class UserService {
	private static List<User> users = new ArrayList<>();

	static {
		User u1 = new User(4, "Eve", "Holt", "https://s3.amazonaws.com/uifaces/faces/twitter/marcoramires/128.jpg");
		User u2 = new User(5, "Charles", "Morris", "https://s3.amazonaws.com/uifaces/faces/twitter/stephenmoon/128.jpg");

		users.add(u1);
		users.add(u2);
	}

	public List<User> getAllUsers() {
		return users;
	}

	public User getUser(int userId) {
		for (User user : users) {
			if (user.getId() == userId) {
				return user;
			}
		}
		return null;
	}
	
	public User addUser(User user) {
		User existedUser = getUser(user.getId());
		if(existedUser != null)	return null;
		
		users.add(user);
		
		return user;
	}
	
	public User deleteUser(int uid)	{
		User existedUser = getUser(uid);
		if(existedUser == null)	return null;
		
		return users.remove(existedUser) ? existedUser : null	;
	}
}