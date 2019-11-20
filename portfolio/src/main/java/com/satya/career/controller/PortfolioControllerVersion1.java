package com.satya.career.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.satya.career.entity.Address;
import com.satya.career.entity.AreaOfExpertise;
import com.satya.career.entity.Education;
import com.satya.career.entity.Profile;
import com.satya.career.entity.Project;
import com.satya.career.entity.Skill;
import com.satya.career.entity.WorkExp;
import com.satya.career.service.AddressService;
import com.satya.career.service.AreaOfExpertiseService;
import com.satya.career.service.EducationService;
import com.satya.career.service.ProfWebsitesService;
import com.satya.career.service.ProfileService;
import com.satya.career.service.ProjectService;
import com.satya.career.service.SkillService;
import com.satya.career.service.WorkExpService;


@Controller
@RequestMapping(value = "/")
public class PortfolioControllerVersion1 {
	


	@Autowired
	private ProfileService profileService;

	@Autowired
	private EducationService educationService;

	@Autowired
	private AddressService addressService;

	@Autowired
	private ProfWebsitesService profWebsitesService;

	@Autowired
	private WorkExpService workExpService;

	@Autowired
	private AreaOfExpertiseService areaOfExpertiseService;

	@Autowired
	private ProjectService projectService;

	@Autowired
	private SkillService skillService;

	public PortfolioControllerVersion1() {
		System.out.println("PortfolioControllerVersion1() is running");
	}

	// read data from database

	public String getMyProfile(Model model) {		
		long profileId =3; 
		System.out.println("Mapping done for profile id"+profileId);
		Profile profile = profileService.getProfile(profileId);
		List<Education> edu = educationService.getEducationList();
        Address address = addressService.getAddress(profileId);
        List<WorkExp> workExpList = workExpService.getWorkExpList();
        List<AreaOfExpertise> areaOfExpertiseList = areaOfExpertiseService.getAreaOfExpertiseList();
        List<Project> projectList = projectService.getProjectsList();
        List<Skill> skillsList =skillService.getSkill();
		model.addAttribute("Profile",profile);
		model.addAttribute("Address",address);
		model.addAttribute("EducationList",edu);
		model.addAttribute("WorkExpList",workExpList);
		model.addAttribute("AreaOfExpertiseList",areaOfExpertiseList);
		model.addAttribute("ProjectList",projectList);
		model.addAttribute("SkillsList",skillsList);
		return "home";
		}
	
	@RequestMapping(value="/test/")
	public String testweb() {
		System.out.println("Website test method in controller executed");
		return "index";		
	}
	

}


