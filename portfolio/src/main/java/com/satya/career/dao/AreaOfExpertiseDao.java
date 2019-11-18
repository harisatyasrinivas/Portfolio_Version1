package com.satya.career.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satya.career.entity.AreaOfExpertise;

@Repository
public interface AreaOfExpertiseDao extends JpaRepository<AreaOfExpertise, Long>  {
	


}
