package com.satya.career.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.satya.career.entity.Skill;


@Repository
public interface SkillDao extends JpaRepository<Skill, Long>{
	
	@Query("select DISTINCT(skillFeild) from Skill")
	public List<String> getUniqueSkillFeilds();	
	
//	public Map<String,List<String>> getskillsinfo();
	
	@Query("select skill from Skill s where s.skillFeild= :skillFeild")
	public List<String> getSkillsByFeild(@Param("skillFeild") String skillFeild);	
}


