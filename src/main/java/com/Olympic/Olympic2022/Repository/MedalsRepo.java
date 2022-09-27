package com.Olympic.Olympic2022.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Olympic.Olympic2022.Model.Medals;

@Repository
public interface MedalsRepo extends JpaRepository<Medals, Long> {

}
