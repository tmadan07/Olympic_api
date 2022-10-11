package com.Olympic.Olympic2022.Service;

import java.util.List;

import com.Olympic.Olympic2022.Model.User;

public interface RegistrationService {
	User saveUser(User emplouseryee);

	User fetchUserByEmail(String email);
	
	User fetchUserByEmailAndPassword(String email, String password);

	List<User> findAll();

//	User updateUsers(User user);

	void deleteUsers(long id);

	User getUsersbyId(long id);

	void updateUsers(long id, User user);

}
