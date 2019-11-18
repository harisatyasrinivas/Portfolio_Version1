package com.satya.career.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.career.dao.WorkExpDao;
import com.satya.career.entity.WorkExp;

@Service
public class WorkExpServiceImpl implements WorkExpService {

	@Autowired
	private WorkExpDao workExpDao;

	@Override
	public WorkExp getWorkExp(long id) {
		return workExpDao.getOne(id);
	}

	@Override
	public List<WorkExp> getWorkExpList() {
		return workExpDao.findAll();
	}

	
}
