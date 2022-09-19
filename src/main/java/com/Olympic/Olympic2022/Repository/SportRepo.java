package com.Olympic.Olympic2022.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Olympic.Olympic2022.Model.Sport;

@Repository
public interface SportRepo extends JpaRepository<Sport, Long> {
 
}