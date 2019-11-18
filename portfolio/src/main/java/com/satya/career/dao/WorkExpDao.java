package com.satya.career.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satya.career.entity.WorkExp;

@Repository
public interface WorkExpDao extends JpaRepository<WorkExp, Long>{
	


}
