package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService {
	private final UserRepository userrepository;

	@Autowired
	public UserService(UserRepository userrepository) {
		this.userrepository = userrepository;
	}

	public List<User> getUsers() {
		return userrepository.findAll();
	}
	
	public List<User> getUserByID(long id) {
		return userrepository.findById(id);
	}

	
	public User authentifier(String emailUser, String passwordUser) {
		return userrepository.findByemilpass(emailUser, passwordUser);
	}

	public User inscription(User user) {
		userrepository.save(user);
		return user;
	}
}
