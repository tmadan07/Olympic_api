package com.Olympic.Olympic2022.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Olympic.Olympic2022.Model.Medals;
import com.Olympic.Olympic2022.Model.User;
import com.Olympic.Olympic2022.Repository.UserRepo;
import com.Olympic.Olympic2022.Service.RegistrationService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class UserController {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private RegistrationService service;
	
	public UserController(RegistrationService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmail = user.getEmail();
		String tempPwd = user.getPassword();
		User userobj = null;
		if (tempEmail != null && tempPwd != null) {
			userobj = service.fetchUserByEmailAndPassword(tempEmail, tempPwd);
		}
		if (userobj == null) {
			throw new Exception("User not found!");
		}
		return userobj;
	}

	//get all User 
	@GetMapping("/register")
	public List<User> getAllUsers(){
		return service.findAll();
	}
	
	
	//create user
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmail = user.getEmail();
		if (tempEmail != null && !"".equals(tempEmail)) {
			User userobj = service.fetchUserByEmail(tempEmail);
			if (userobj != null) {
				throw new Exception("User with " + tempEmail + " is already exists.");
			}
		}
		User userobj = null;
		userobj = service.saveUser(user);
		return userobj;
	}
	
//	@PutMapping("/register/{id}")
//	 public User updateUsers(@RequestBody User user) {
//			return service.updateUsers(user);
//	}
	
	@DeleteMapping("/register/{id}")  
	private void deleteUsers(@PathVariable("id") long id)   
	{  
		service.deleteUsers(id); 
		 System.out.println("Delete successfully");
	} 
	
	@GetMapping("/register/{id}")  
	private User getUsers(@PathVariable("id") long id)   
	{  
		 return service.getUsersbyId(id);   
	} 
	
	@PutMapping("/register/{id}")
	 public ResponseEntity <User> updateUsers(@PathVariable("id") long id, @RequestBody User user) {
		service.updateUsers(id ,user);
			 return new ResponseEntity<>(service.getUsersbyId(id), HttpStatus.OK);
		}
	

}