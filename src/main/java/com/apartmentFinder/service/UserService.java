package com.apartmentFinder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apartmentFinder.dao.UserRepository;
import com.apartmentFinder.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public int processOAuthPostLogin(String username, String name) {
		User existUser = repo.getUserByUsername(username);

		if (existUser == null) {
			User newUser = new User();
			newUser.setUsername(username);
			newUser.setName(name);

			// repo.save(newUser);
			User object = repo.saveAndFlush(newUser);

			System.out.println("Created new user: " + username);
			return object.getUserId();
		} else {
			return existUser.getUserId();
		}

	}

	public void save(User user) {
		repo.save(user);
	}

	public User get(int id) {
		return repo.getOne(id);
	}

	public void update(int id, String password, String contactno, String emailaddress) {
		System.out.println("Inside user service");
		System.out.println(contactno);
		repo.update(id, password, contactno, emailaddress);
	}

}
