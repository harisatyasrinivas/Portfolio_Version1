package com.satya.career.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.career.dao.ProjectDao;
import com.satya.career.entity.Project;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectDao projectDao;

	@Override
	public Project getProjects(long id) {
		return projectDao.getOne(id);
	}

	@Override
	public List<Project> getProjectsList() {
		return projectDao.findAll();
	}



}
