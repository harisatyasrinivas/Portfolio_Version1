package com.satya.career.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.career.dao.ProfileDao;
import com.satya.career.entity.Profile;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileDao profileDao;

	@Override
	public Profile getProfile(long id) {

		return profileDao.getOne(id);

	}

}
