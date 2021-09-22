package com.netjstech.dao;
import java.util.*;
import com.netjstech.entities.User;
public interface UserDAO {
	public void addUser(User user);
	public List<User> findAllUser();
	public User findUserById(int id);
	public void deleteUserById(int id);
	}
