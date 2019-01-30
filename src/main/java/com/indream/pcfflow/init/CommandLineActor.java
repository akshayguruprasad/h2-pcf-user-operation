package com.indream.pcfflow.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.indream.pcfflow.model.User;
import com.indream.pcfflow.repository.UserRepo;

@Component
public class CommandLineActor implements CommandLineRunner {

	@Autowired
	private UserRepo userRepo;

	@Override
	public void run(String... args) throws Exception {
		userRepo.save(new User(3, "kishan", "kishan@gmail.com"));
		userRepo.save(new User(4, "ram", "ram@gmail.com"));
		System.out.println("called out");
	}

}
