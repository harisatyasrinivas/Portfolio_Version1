package com.satya.career.service;

import java.util.List;
import java.util.Map;

import com.satya.career.entity.Skill;

public interface SkillService {
	
	public List<Skill> getSkill();	

	public List<String> getUniqueSkillFeilds();	
	
	public Map<String,List<String>> getskillsinfo();
		
}

