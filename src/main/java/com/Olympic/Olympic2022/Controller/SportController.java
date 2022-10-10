package com.Olympic.Olympic2022.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Olympic.Olympic2022.Model.Sport;
import com.Olympic.Olympic2022.Repository.SportRepo;

@CrossOrigin(origins = "*", maxAge=3600)
@RestController
@RequestMapping("/api/v1/")
public class SportController {
	
	@Autowired
	private SportRepo sportsRepo;

	//get all sports 
	@GetMapping("/sports")
	public List<Sport> getAllSports(){
		return sportsRepo.findAll();
	}
	
	//create sports
	@PostMapping("/sports") 
	public Sport createSports (@RequestBody Sport sports) {
		return sportsRepo.save(sports);
	}
}
