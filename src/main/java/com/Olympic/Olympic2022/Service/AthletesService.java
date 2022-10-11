package com.Olympic.Olympic2022.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.multipart.MultipartFile;

import com.Olympic.Olympic2022.Model.Athletes;
import com.Olympic.Olympic2022.Model.Medals;
import com.Olympic.Olympic2022.Repository.AthletesRepo;

@CrossOrigin(origins = "http://localhost:3000" )
@Service
public class AthletesService {
	@Autowired
	private AthletesRepo athletesRepo;
	
	public void  saveProductToDB(MultipartFile file,String fullname,String country, String sport
			,int totalMedals)
	{
		
		Athletes a = new Athletes();
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains(".."))
		{
			System.out.println("not a a valid file");
		}
		try {
			
			a.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		a.setFullname(fullname);
		a.setCountry(country);
		
       a.setSport(sport);
       a.setTotalMedals(totalMedals);
        
        athletesRepo.save(a);
	}
	
	public void delete(long id) {
		 athletesRepo.deleteById(id);
		 
	}

	public Athletes save(Athletes athletes) {
		return athletesRepo.save(athletes);
		
	}

	public List<Athletes> getAllAthletes() {
		List<Athletes> athletes = new ArrayList<Athletes>();  
		athletesRepo.findAll().forEach(athletes1 -> athletes.add(athletes1));  
		return athletes;  
	}

//	public Athletes updateAthletes(Athletes athletes) {
//		// TODO Auto-generated method stub
//		return athletesRepo.save(athletes);
//	}


	public Athletes getAthleteById(long id) {
		return athletesRepo.findById(id).get();
	}

//	public void updateAthletes(long id, Athletes athletes) {
//		// TODO Auto-generated method stub
//		
//	}
	
	public void updateAthletes(long id, Athletes athletes) {
		Athletes m = athletesRepo.findById(id).get();
		 m.setImage(athletes.getImage());
		 m.setCountry(athletes.getCountry());
		 m.setFullname(athletes.getFullname());
		 m.setSport(athletes.getSport());
		 m.setTotalMedals(athletes.getTotalMedals());
		 athletesRepo.save(m);
		
	}


	

}
