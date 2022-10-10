package com.Olympic.Olympic2022.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Olympic.Olympic2022.Model.Athletes;
import com.Olympic.Olympic2022.Model.Medals;
import com.Olympic.Olympic2022.Repository.MedalsRepo;
import com.Olympic.Olympic2022.Service.MedalsService;


@CrossOrigin(origins = "*", maxAge=3600)
@RestController
@RequestMapping("/api/v1/")
public class MedalsController {
	
//	@Autowired
//	private MedalsRepo medalsRepo;
	
	@Autowired
	private MedalsService medalsService;

	//get all athletes 
	@GetMapping("/medals")
	public List<Medals> getAllMedals(){
		return medalsService.findAll();
	}
	
	@GetMapping("/medal/{id}")  
	private Medals getMedals(@PathVariable("id") long id)   
	{  
		 return medalsService.getMedalsById(id);   
	} 
	
	//create athletes
	@PostMapping("/medals") 
	public Medals createMedals (@RequestBody Medals medals) {
		return medalsService.save(medals);
	}
	
	@DeleteMapping("/medal/{id}")  
	private void deleteMedals(@PathVariable("id") long id)   
	{  
		medalsService.delete(id); 
		 System.out.println("Delete successfully");
	} 
	
	
	 @PutMapping("/medal/{id}")
	 public Medals updateMedals(@RequestBody Medals medals) {
			return medalsService.updateMedals(medals);
		}

}
