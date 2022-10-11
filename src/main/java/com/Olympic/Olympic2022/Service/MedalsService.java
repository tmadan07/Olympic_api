package com.Olympic.Olympic2022.Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Olympic.Olympic2022.Model.Athletes;
import com.Olympic.Olympic2022.Model.Medals;
import com.Olympic.Olympic2022.Repository.MedalsRepo;

@Service
public class MedalsService {
	
	@Autowired
	private MedalsRepo medalsRepo;
	
	
	public void  saveProductToDB(int rank,String country,int gold,int silver, int bronze
			,int total)
	{
		Medals m = new Medals();
		
		m.setRank(rank);
		m.setCountry(country);
		
       m.setGold(gold);
       m.setSilver(silver);
       m.setBronze(bronze);
       m.setTotal(total);
        
        medalsRepo.save(m);
	}
	
	public void delete(long id) {
		medalsRepo.deleteById(id);
		 
	}

	public Medals save(Medals medals) {
		return medalsRepo.save(medals);
		
	}

//	public void updateMedals(long id, Medals medals) {
//		// TODO Auto-generated method stub
//		 medalsRepo.save(medals);
//	}

	public List<Medals> findAll() {
		List<Medals> medals = new ArrayList<Medals>();  
		medalsRepo.findAll().forEach(medals1 -> medals.add(medals1));  
		return medals;  
	}

	public Medals getMedalsById(long id) {
	
		return medalsRepo.findById(id).get();
	}


	public void updateMedals(long id, Medals medals) {
		Medals m = medalsRepo.findById(id).get();
		 m.setRank(medals.getRank());
		 m.setCountry(medals.getCountry());
		 m.setGold(medals.getGold());
		 m.setSilver(medals.getSilver());
		 m.setBronze(medals.getBronze());
		 m.setTotal(medals.getTotal());
		 medalsRepo.save(m);
		
	}

	
}
