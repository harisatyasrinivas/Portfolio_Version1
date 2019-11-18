package com.satya.career.service;

import java.util.List;

import com.satya.career.entity.WorkExp;

public interface WorkExpService {
	
	public WorkExp getWorkExp(long id);
	public List<WorkExp> getWorkExpList();

}
