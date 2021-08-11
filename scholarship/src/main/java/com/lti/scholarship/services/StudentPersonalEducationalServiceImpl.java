package com.lti.scholarship.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.beans.StudentPersonalEducational;
import com.lti.scholarship.dao.StudentPersonalEducationalDao;


@Service("studPEService")
public class StudentPersonalEducationalServiceImpl implements StudentPersonalEducationalService {

	@Autowired
	private StudentPersonalEducationalDao studPEDao;
	
	
	
	public StudentPersonalEducationalDao getStudPEDao() {
		return studPEDao;
	}

	public void setStudPEDao(StudentPersonalEducationalDao studPEDao) {
		this.studPEDao = studPEDao;
	}

	@Override
	public void saveAcademicDetails(StudentPersonalEducational a) {
		studPEDao.saveAcademicDetails(a);
		
	}

	@Override
	public List<StudentPersonalEducational> displayAll() {
		return studPEDao.displayAll();
	}
	
	

}
