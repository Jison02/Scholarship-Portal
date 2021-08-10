package com.lti.scholarship.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.beans.StudentAcademic;
import com.lti.scholarship.dao.StudAcademicDao;

@Service("studAcadService")
public class StudAcademicServiceImpl implements StudAcademicService {
	
	@Autowired
	private StudAcademicDao studAcadDao;

	public StudAcademicDao getStudAcadDao() {
		return studAcadDao;
	}

	public void setStudAcadDao(StudAcademicDao studAcadDao) {
		this.studAcadDao = studAcadDao;
	}

	@Override
	public void saveAcademicDetails(StudentAcademic a) {
		studAcadDao.saveAcademicDetails(a);
		
	}

	@Override
	public List<StudentAcademic> displayAll() {
		return studAcadDao.displayAll();
	}
	
	

}
