package com.lti.scholarship.services;

import java.util.List;

import com.lti.scholarship.beans.StudentPersonalEducational;



public interface StudentPersonalEducationalService {
	public void saveAcademicDetails(StudentPersonalEducational a);
	
	public List<StudentPersonalEducational> displayAll();
}
