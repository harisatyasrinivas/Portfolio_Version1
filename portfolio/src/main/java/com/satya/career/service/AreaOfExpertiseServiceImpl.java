package com.satya.career.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.career.dao.AreaOfExpertiseDao;
import com.satya.career.entity.AreaOfExpertise;

@Service
public class AreaOfExpertiseServiceImpl implements AreaOfExpertiseService {

	@Autowired
	private AreaOfExpertiseDao areaOfExpertiseDao;
	
	@Override
	public List<AreaOfExpertise> getAreaOfExpertiseList() {
		return areaOfExpertiseDao.findAll();
	}
	

}
