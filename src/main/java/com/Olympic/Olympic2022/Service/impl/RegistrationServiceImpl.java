package com.Olympic.Olympic2022.Service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.Olympic.Olympic2022.Model.User;
import com.Olympic.Olympic2022.Repository.UserRepo;
import com.Olympic.Olympic2022.Service.RegistrationService;

@CrossOrigin(origins = "*")
@Service
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	private UserRepo userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public User fetchUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public User fetchUserByEmailAndPassword(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
}
