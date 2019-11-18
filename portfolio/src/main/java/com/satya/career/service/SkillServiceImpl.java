package com.satya.career.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.career.dao.SkillDao;
import com.satya.career.entity.Skill;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillDao skillDao;

	@Override
	public List<Skill> getSkill() {
		return skillDao.findAll();
	}

}
