package com.satya.career.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.career.dao.EducationDao;
import com.satya.career.entity.Education;

@Service
@Transactional
public class EducationServiceImpl implements EducationService {

	@Autowired
	private EducationDao educationDao;

	@Override
	public Education getEducationProfile(long id) {
		return educationDao.getOne(id);
	}

	@Override
	public List<Education> getEducationList() {
		return educationDao.findAll();
	}

}
