package com.lti.scholarship.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.scholarship.beans.ScholarshipForm;
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

	@Override
	public List<StudentAcademic> displayAll() {
		String sql = "SELECT details from StudentAcademic details";
		System.out.println("Dao layer -->");
		Query query = em.createQuery(sql);
		
		List<StudentAcademic> addressList = query.getResultList();
		return addressList;
	}
	
	

}
