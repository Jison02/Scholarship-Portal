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
import com.lti.scholarship.beans.StudentPersonalEducational;
import com.lti.scholarship.services.StudentPersonalEducationalServiceImpl;

@RestController
@RequestMapping("/api/v2")
@CrossOrigin(origins="*")
public class StudentPersonalEducationalController {
	
	@Autowired
	private StudentPersonalEducationalServiceImpl studPEService;
	
	@PostMapping("/new-details")
	public void saveAcademicDetails(@RequestBody StudentPersonalEducational detail) {
		 studPEService.saveAcademicDetails(detail);
	}
	
	@GetMapping("/get-details")
	public List<StudentPersonalEducational> displayAll(){
		System.out.println("inside controller");
		List<StudentPersonalEducational> detailsList = studPEService.displayAll();
		return detailsList;
	}

}
