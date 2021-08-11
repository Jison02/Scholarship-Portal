package com.lti.scholarship.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.scholarship.beans.StudentAcademic;
import com.lti.scholarship.beans.StudentPersonalEducational;


@Repository("studPEDao")
public class StudentPersonalEducationalDaoImpl implements StudentPersonalEducationalDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public void saveAcademicDetails(StudentPersonalEducational a) {
		
		em.persist(a);
	}

	@Override
	public List<StudentPersonalEducational> displayAll() {
		String sql = "SELECT details from StudentPersonalEducational details";
		System.out.println("Dao layer -->");
		Query query = em.createQuery(sql);
		
		List<StudentPersonalEducational> detailsList = query.getResultList();
		return detailsList;
	}
	
	

}
