package com.lti.scholarship.dao;

import java.util.List;

import com.lti.scholarship.beans.ScholarshipForm;

public interface ScholarshipFormDao {
	
	public void saveFormDetails(ScholarshipForm form);
	
	public List<ScholarshipForm> displayAll();
	
}
