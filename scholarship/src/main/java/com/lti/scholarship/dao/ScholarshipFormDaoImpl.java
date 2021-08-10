package com.lti.scholarship.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	@Override
	public List<ScholarshipForm> displayAll() {
		String sql = "SELECT f from ScholarshipForm f";
		System.out.println("Dao layer -->");
		Query query = em.createQuery(sql);
		
		List<ScholarshipForm> formList = query.getResultList();
		return formList;
	}

}
