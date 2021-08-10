package com.lti.scholarship.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.beans.ScholarshipForm;
import com.lti.scholarship.dao.ScholarshipFormDao;

@Service("formService")
public class ScholarshipFormServiceImpl implements ScholarshipFormSevice {
	
	@Autowired
	private ScholarshipFormDao formDao;

	public ScholarshipFormDao getFormDao() {
		return formDao;
	}

	public void setFormDao(ScholarshipFormDao formDao) {
		this.formDao = formDao;
	}

	@Override
	public void saveFormDetails(ScholarshipForm form) {
		formDao.saveFormDetails(form);
		
	}
	
	

}
