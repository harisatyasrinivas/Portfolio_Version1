package com.satya.career.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satya.career.entity.Education;

@Repository
public interface EducationDao extends JpaRepository<Education, Long> {
	

}
