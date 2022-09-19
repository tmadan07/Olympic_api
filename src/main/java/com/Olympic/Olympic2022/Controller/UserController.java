package com.Olympic.Olympic2022.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	//get all User 
	@GetMapping("/register")
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	//create user
	@PostMapping("/register") 
	public User createUsers (@RequestBody User user) {
		return userRepo.save(user);
	}
	
//	@PostMapping("/process_register")
//	public String processRegister(User user) {
//	    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//	    String encodedPassword = passwordEncoder.encode(user.getPassword());
//	    user.setPassword(encodedPassword);
//	     
//	    userRepo.save(user);
//	     
//	    return "register_success";
//	}
}
	
	
	
	
	
	