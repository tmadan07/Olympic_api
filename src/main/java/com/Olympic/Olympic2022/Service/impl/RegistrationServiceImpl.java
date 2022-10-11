package com.Olympic.Olympic2022.Service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Olympic.Olympic2022.Model.Medals;
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
	
	
	 @Override 
	 public void updateUsers(long id, User user) {
			User m = userRepository.findById(id).get();
			 m.setFirstName(user.getFirstName());
			 m.setCountry(user.getCountry());
			 m.setLastName(user.getLastName());
			 m.setUsername(user.getUsername());
			 m.setEmail(user.getEmail());
			 m.setPassword(user.getPassword());
			 userRepository.save(m);
			
		}

	
	@Override
	public void deleteUsers(long id) {
		userRepository.deleteById(id);	 
	}
	

	@Override
	public User getUsersbyId(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}
	
}
