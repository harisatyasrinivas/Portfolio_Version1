package com.satya.career.service;

import java.util.List;

import com.satya.career.entity.Education;

public interface EducationService {

	public Education getEducationProfile(long id);

	public List<Education> getEducationList();

}
