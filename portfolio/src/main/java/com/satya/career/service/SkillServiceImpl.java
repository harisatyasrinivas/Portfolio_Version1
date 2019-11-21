package com.satya.career.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

	@Override
	public List<String> getUniqueSkillFeilds() {
		return skillDao.getUniqueSkillFeilds();
	}

	@Override
	public Map<String, List<String>> getskillsinfo() {

		Map<String, List<String>> skillMap = new LinkedHashMap<String, List<String>>();
		List<String> skillFeilds = skillDao.getUniqueSkillFeilds();
		for (String feild : skillFeilds) {
			List<String> skills = skillDao.getSkillsByFeild(feild);
			// Key and Value Insertion
			skillMap.put(feild, skills);
		}
		return skillMap;
	}

	// TEST METHOD
//	public Map<String,List<String>> getskillsinfo()
//	{
//		Map<String,List<String>> mapobj = new LinkedHashMap<String, List<String>>();
//		List<String> skilList = new ArrayList<String>();
//		skilList.add("Java");
//		skilList.add("Java");
//		skilList.add("Java");
//		mapobj.put("UI Deisgn", skilList);
//		mapobj.put("Front end", skilList);
//		return mapobj;
//	}

}
