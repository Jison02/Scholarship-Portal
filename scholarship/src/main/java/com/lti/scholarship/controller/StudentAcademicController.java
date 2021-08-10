package com.lti.scholarship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.scholarship.beans.ScholarshipForm;
import com.lti.scholarship.beans.StudentAcademic;
import com.lti.scholarship.services.ScholarshipFormServiceImpl;
import com.lti.scholarship.services.StudAcademicServiceImpl;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins="*")
public class StudentAcademicController {
	
	@Autowired
	private StudAcademicServiceImpl studAcadService;
	
	@PostMapping("/newedudetails")
	public void saveFormDetails(@RequestBody StudentAcademic details) {
		 studAcadService.saveAcademicDetails(details);
	}
	
	@GetMapping("/academicdetails")
	public List<StudentAcademic> displayAll(){
		System.out.println("inside controller");
		List<StudentAcademic> academicDetailsList = studAcadService.displayAll();
		return academicDetailsList;
	}

}
