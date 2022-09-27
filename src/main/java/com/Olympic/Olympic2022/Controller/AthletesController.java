package com.Olympic.Olympic2022.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Olympic.Olympic2022.Service.AthletesService;
import com.Olympic.Olympic2022.Model.Athletes;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/")
public class AthletesController {
	
	@Autowired
	private AthletesService athletesService;


	@GetMapping("/athletes")
	public List<Athletes> getAllAthletes(){
		return  athletesService.getAllAthletes();
	}
	
	@GetMapping("/athletes/player/{id}")  
	private Athletes getAthletes(@PathVariable("id") long id)   
	{  
		 return athletesService.getBooksById(id);   
	} 
	
	
	//create athletes
	@PostMapping("/athletes") 
	public Athletes createAthletes (@RequestBody Athletes athletes) {
		return athletesService.save(athletes);
	}
	
	@DeleteMapping("/athletes/{id}")  
	private void deleteAthletes(@PathVariable("id") long id)   
	{  
		 athletesService.delete(id); 
		 System.out.println("Delete successfully");
	} 
	
	
	 @PutMapping("/athletes/{id}")
	 public Athletes updateAthletes(@RequestBody Athletes athletes) {
			return athletesService.updateAthletes(athletes);
		}
}










