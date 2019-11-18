package com.satya.career.service;

import java.util.List;

import com.satya.career.entity.Project;

public interface ProjectService {
	
	public Project getProjects(long id);
	public List<Project> getProjectsList();

}
