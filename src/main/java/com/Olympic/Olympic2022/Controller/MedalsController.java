package com.Olympic.Olympic2022.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Olympic.Olympic2022.Model.Medals;
import com.Olympic.Olympic2022.Repository.MedalsRepo;



@CrossOrigin(origins = "http://localhost:3000" )
@RestController
@RequestMapping("/api/v1/")
public class MedalsController {
	
	@Autowired
	private MedalsRepo medalsRepo;

	//get all athletes 
	@GetMapping("/medals")
	public List<Medals> getAllMedals(){
		return medalsRepo.findAll();
	}
	
	//create athletes
	@PostMapping("/medals") 
	public Medals createMedals (@RequestBody Medals medals) {
		return medalsRepo.save(medals);
	}

}
