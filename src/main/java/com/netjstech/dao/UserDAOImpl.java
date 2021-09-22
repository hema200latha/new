package com.netjstech.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.netjstech.entities.User;
@Repository
public class UserDAOImpl implements UserDAO{
	@PersistenceContext
	private EntityManager em;

	public void addUser(User user) {
		em.persist(user);
		// TODO Auto-generated method stub
		
	}

	public List<User> findAllUsers() {
		List<User> users= em.createQuery("Select distinct u from User u join fetch u.accounts",User.class).getResultList();
		// TODO Auto-generated method stub
		return users;
	}

	public User findUserById(int id) {
		return em.find(User.class, id);
	}

	public void deleteUserById(int id) {
		User user = findUserById(id);
		if(user!=null) {
			em.remove(user);
		}
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}
}
