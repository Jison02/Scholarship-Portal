package com.lti.scholarship.services;

import java.util.List;

import com.lti.scholarship.beans.StudentAcademic;

public interface StudAcademicService {
	
	public void saveAcademicDetails(StudentAcademic a);
	
	public List<StudentAcademic> displayAll();

}
