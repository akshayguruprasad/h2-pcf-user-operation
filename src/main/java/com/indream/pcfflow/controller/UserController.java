package com.indream.pcfflow.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indream.pcfflow.model.User;
import com.indream.pcfflow.repository.UserRepo;

@RestController
public class UserController {

	@Autowired
	private UserRepo userRepo;

	@GetMapping("/all")
	public List<User> getAllUsers() {
		System.out.println("before iteration the method has started");
		Iterable<User> allusers = userRepo.findAll();
		List<User> users = new ArrayList<User>();
		allusers.forEach((data) -> {
			users.add(data);
		});
		return users;
	}

}
