package com.netjstech.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com. netjstech.entities.User;
import com.netjstech.service.Userservice;

	@RestController
	public class UserController {
		@Autowired
		Userservice userService;
		@PostMapping("/user")
		public void addUser(@RequestBody User user) {
			userService.addUser(user);
		}
		@GetMapping("/users")
		public List<User> getAllUsers(){
			return userService.findAllUsers();		
		}
		@GetMapping("/users/{userid}")
		public User getUserById(@PathVariable("userid") int userid) {
			return userService.findUserById(userid);
		}
		@DeleteMapping("/user/{userid}")
		public void deleteUserById(@RequestBody int userid) {
			userService.deleteUserBy(userid);
			
		}
	}

