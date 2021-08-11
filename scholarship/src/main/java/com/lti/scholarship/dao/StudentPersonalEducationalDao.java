package com.lti.scholarship.dao;

import java.util.List;

import com.lti.scholarship.beans.StudentPersonalEducational;

public interface StudentPersonalEducationalDao {
	
	public void saveAcademicDetails(StudentPersonalEducational a);
	public List<StudentPersonalEducational> displayAll();

}
