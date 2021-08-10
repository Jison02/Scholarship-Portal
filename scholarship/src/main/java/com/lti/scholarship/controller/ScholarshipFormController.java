package com.lti.scholarship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.scholarship.beans.ScholarshipForm;
import com.lti.scholarship.services.ScholarshipFormServiceImpl;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins="*")
public class ScholarshipFormController {
	
	@Autowired
	private ScholarshipFormServiceImpl formService;
	
	@PostMapping("/newForm")
	public void saveFormDetails(@RequestBody ScholarshipForm form) {
		 formService.saveFormDetails(form);
	}
	
}
