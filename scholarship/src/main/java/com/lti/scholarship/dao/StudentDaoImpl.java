package com.lti.scholarship.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.scholarship.beans.Institute;
import com.lti.scholarship.beans.Student;
import com.lti.scholarship.exp.StudException;
import com.lti.scholarship.services.InstituteService;


@Repository("studDao")
public class StudentDaoImpl implements StudentDao {
	
	@PersistenceContext
	private EntityManager em;

	@Autowired
	InstituteService instService;

	@Override
	@Transactional
	public String registerStudent(Student stud, String code) {
//		Institute instObj = instService.instituteShowDetails(code);
//		if(instObj==null)
//			return "Institute does not exist";
//		stud.setInstitute(instObj);
//		em.persist(stud);
		return "Student successfully added";
	}

	@Override
	@Transactional
	public Student loginStudent(String stud_id, String stud_pwd) {
		String sql = "From Student where stud_id= :stud_id and stud_pwd= :stud_pwd";
		TypedQuery<Student> tq = em.createQuery(sql, Student.class);
		tq.setParameter("stud_id", stud_id);
		tq.setParameter("stud_pwd", stud_pwd);
		Student stud = tq.getSingleResult();
		return stud;
	}

	@Override
	@Transactional
	public Student showStudentDetails(String stud_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public String updatePassword(String stud_id, String old_pwd, String new_pwd) throws StudException {
		// TODO Auto-generated method stub
		return null;
	}

}
