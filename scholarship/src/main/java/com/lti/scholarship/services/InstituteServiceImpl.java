package com.lti.scholarship.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.beans.Institute;
import com.lti.scholarship.dao.InstituteDaoImpl;
import com.lti.scholarship.exp.InstException;

@Service("instService")
public class InstituteServiceImpl implements InstituteService {
	
	@Autowired
	InstituteDaoImpl instDao;

	@Override
	public String registerInstitute(Institute inst) {
		return instDao.registerInstitute(inst);
	}

	@Override
	public Institute loginInstitute(String inst_code, String pwd) {
		return instDao.loginInstitute(inst_code, pwd);
	}

	@Override
	public Institute instituteShowDetails(String inst_code) {
		return instDao.instituteShowDetails(inst_code);
	}

	@Override
	public String updatePassword(String inst_code, String old_pwd, String new_pwd) throws InstException {
		return instDao.updatePassword(inst_code, old_pwd, new_pwd);
	}

	@Override
	public String updatePrincipalName(String inst_code, String new_princi_name) {
		return instDao.updatePrincipalName(inst_code, new_princi_name);
	}

	@Override
	public String updatePhoneNo(String inst_code, String new_phone_no) {
		return instDao.updatePhoneNo(inst_code, new_phone_no);
	}

}
