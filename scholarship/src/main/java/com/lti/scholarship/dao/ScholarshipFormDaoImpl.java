package com.lti.scholarship.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.scholarship.beans.ScholarshipForm;

@Repository("formDao")
public class ScholarshipFormDaoImpl implements ScholarshipFormDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public void saveFormDetails(ScholarshipForm form) {
		
		em.persist(form);
	}

}
