package com.satya.career.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.satya.career.dao.ProfWebsitesDao;
import com.satya.career.entity.ProfWebsites;

@Service
@Transactional
public class ProfWebsitesServiceImpl implements ProfWebsitesService {
	
	private ProfWebsitesDao profWebsitesDao;

	@Override
	public ProfWebsites getProfWebsites(long id) {
		return profWebsitesDao.getOne(id);
	}

	@Override
	public List<ProfWebsites> getProfWebsitesList() {
		return profWebsitesDao.findAll();
	}


}
