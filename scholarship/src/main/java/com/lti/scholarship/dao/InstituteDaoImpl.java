package com.lti.scholarship.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.scholarship.beans.Institute;
import com.lti.scholarship.exp.InstException;


@Repository("intDao")
public class InstituteDaoImpl implements InstituteDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public String registerInstitute(Institute inst) {
		em.persist(inst);
		return "Successfully added";
	}

	@Override
	@Transactional
	public Institute loginInstitute(String inst_code, String pwd) {
		String sql = "From Institute where inst_code= :inst_code and inst_pwd= :pwd";
		TypedQuery<Institute> tq = em.createQuery(sql, Institute.class);
		tq.setParameter("inst_code", inst_code);
		tq.setParameter("pwd", pwd);
		Institute inst = tq.getSingleResult();
		return inst;
	}

	@Override
	@Transactional
	public Institute instituteShowDetails(String inst_code) {
		String sql = "From Institute where inst_code= :inst_code";
		TypedQuery<Institute> tq = em.createQuery(sql, Institute.class);
		tq.setParameter("inst_code", inst_code);
		Institute inst = tq.getSingleResult();
		return inst;
	}

	@Override
	@Transactional
	public String updatePassword(String inst_code, String old_pwd, String new_pwd) throws InstException {
			Institute inst = em.find(Institute.class, inst_code);
		
			if (!old_pwd.equals(inst.getInst_pwd()))
			//throw new InstException("Password mismatch");
				return "Password mismatch";
			else {
				String sql = "update Institute set inst_pwd= :new_pwd where inst_code = :inst_code";
				Query qry = em.createQuery(sql);
				qry.setParameter("inst_code", inst_code);
				qry.setParameter("new_pwd", new_pwd);
				int status = qry.executeUpdate();
				System.out.println(status);
			}
			return "Password Updated";
	}

	@Override
	public String updatePrincipalName(String inst_code, String new_princi_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updatePhoneNo(String inst_code, String new_phone_no) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
