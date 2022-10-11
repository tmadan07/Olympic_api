package com.Olympic.Olympic2022;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Olympic.Olympic2022.Model.Athletes;
import com.Olympic.Olympic2022.Model.Medals;
import com.Olympic.Olympic2022.Repository.AthletesRepo;
import com.Olympic.Olympic2022.Repository.MedalsRepo;

@SpringBootTest
class Olympic2022ApplicationTests {
	
//	@Autowired
//	AthletesRepo athletesRepository;
//
//	@Autowired
//	MedalsRepo medalRepository;
//	
//	
//	@Test
//	public void Athletestest () {
//		Athletes a = new Athletes();
//		a.setCountry("Nepal");
//		a.setCountry("Madan Thapa");
//		a.setImage("C:\\Users\\Dell\\OneDrive\\Pictures\\Screenshots\\one.png");
//		a.setSport("Football");
//		a.setTotalMedals(10);
//		athletesRepository.save(a);
//		assertNotNull(athletesRepository.findById(1L).get());
//	}

	
	
//	@Test
//	public void testCreate () {
//		Medals m = new Medals();
//		m.setRank(4);
//		m.setCountry("Nepal");
//		m.setGold(5);
//		m.setSilver(5);
//		m.setBronze(2);
//		m.setTotal(12);
//		medalRepository.save(m);
//		assertNotNull(medalRepository.findById(1L).get());
//	}
//	
//	@Test
//	public void testUpdate () {
//		Medals m = medalRepository.findById(1L).get();
//		m.setCountry("Bhutan");
//		medalRepository.save(m);
//		assertNotNull(medalRepository.findById(1L).get());
//	}
	
	

}
