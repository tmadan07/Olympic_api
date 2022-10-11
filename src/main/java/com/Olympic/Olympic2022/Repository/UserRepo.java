package com.Olympic.Olympic2022.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Olympic.Olympic2022.Model.Medals;
import com.Olympic.Olympic2022.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	public User findByEmailAndPassword(String email, String password);
	
	public User findByEmail(String email);

}