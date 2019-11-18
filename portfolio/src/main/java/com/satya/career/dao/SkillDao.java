package com.satya.career.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satya.career.entity.Skill;


@Repository
public interface SkillDao extends JpaRepository<Skill, Long>{
	
	


}
