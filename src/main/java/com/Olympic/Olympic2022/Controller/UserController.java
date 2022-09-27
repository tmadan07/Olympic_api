package com.Olympic.Olympic2022.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Olympic.Olympic2022.Model.User;
import com.Olympic.Olympic2022.Repository.UserRepo;

@CrossOrigin(origins = "http://localhost:3000" )
@RestController
@RequestMapping("/api/v1/")
public class UserController {
	
	@Autowired
	private UserRepo userRepo;
	
//	@PostMapping("/login")
//	public User login(@RequestBody String username) {
//		User user = userRepo.findByEmail(username);
//        if (username == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//		
//		return userRepo.save(username);
//	}
	

	//get all User 
	@GetMapping("/register")
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	//create user
	@PostMapping("/register") 
	public User createUsers (@RequestBody User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    String encodedPassword = passwordEncoder.encode(user.getPassword());
	    user.setPassword(encodedPassword);
		return userRepo.save(user);
	}
	

}
	
	
	
	
	
	