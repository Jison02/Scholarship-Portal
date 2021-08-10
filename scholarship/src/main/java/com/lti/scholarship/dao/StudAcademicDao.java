package com.lti.scholarship.dao;

import java.util.List;

import com.lti.scholarship.beans.StudentAcademic;

public interface StudAcademicDao {
	
	public void saveAcademicDetails(StudentAcademic a);
	public List<StudentAcademic> displayAll();

}
