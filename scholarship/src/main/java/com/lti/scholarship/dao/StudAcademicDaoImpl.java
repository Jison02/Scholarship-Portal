package com.lti.scholarship.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.scholarship.beans.StudentAcademic;

@Repository("studAcadDao")
public class StudAcademicDaoImpl implements StudAcademicDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public void saveAcademicDetails(StudentAcademic a) {
		System.out.println("Dao layer.....");
		em.persist(a);
		
	}
	
	

}
