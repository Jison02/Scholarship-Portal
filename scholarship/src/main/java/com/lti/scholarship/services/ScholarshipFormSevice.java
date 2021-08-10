package com.lti.scholarship.services;

import java.util.List;

import com.lti.scholarship.beans.ScholarshipForm;

public interface ScholarshipFormSevice {
	
	public void saveFormDetails(ScholarshipForm form);
	
	public List<ScholarshipForm> displayAll();

}
