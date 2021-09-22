package com.netjstech.service;
import java.util.*;
import com.netjstech.entities.User;

public interface Userservice {
	public void addUser(User user);
	public List<User>findAllUsers();
	public User findUserById(int id);
	public void deleteUserBy(int id);
	}

