package com.netjstech.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netjstech.dao.UserDAO;
import com.netjstech.entities.User;

@Service
@Transactional
public class userServiceImpl implements Userservice{
	
	@Autowired
	private UserDAO dao;

	@Override
	@Transactional
	public void addUser(User user) {
		dao.addUser(user);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return dao.findAllUser();
	}

	@Override
	public User findUserById(int id) {
		User user = dao.findUserById(id);
		return user;
	}

	@Transactional
	public void deleteUserById(int id) {
		dao.deleteUserById(id);
		
	}

	@Override
	public void deleteUserBy(int id) {
		// TODO Auto-generated method stub
		
	}

	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}


