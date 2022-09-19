package com.Olympic.Olympic2022.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Olympic.Olympic2022.Repository.AthletesRepo;
import com.Olympic.Olympic2022.Model.Athletes;

@CrossOrigin(origins = "http://localhost:3000" )
@RestController
@RequestMapping("/api/v1/")
public class AthletesController {
	
	@Autowired
	private AthletesRepo athletesRepo;

	//get all athletes 
	@GetMapping("/athletes")
	public List<Athletes> getAllAthletes(){
		return athletesRepo.findAll();
	}
	
	//create athletes
	@PostMapping("/athletes") 
	public Athletes createAthletes (@RequestBody Athletes athletes) {
		return athletesRepo.save(athletes);
	}
}
