package com.lti.scholarship.services;

import com.lti.scholarship.beans.Student;
import com.lti.scholarship.exp.StudException;

public interface StudentService {
	
	public String registerStudent(Student stud, String code);
//	public String registerStudent(Student stud);
	public Student loginStudent(String stud_id,String stud_pwd);
	public Student showStudentDetails(String stud_id);  
	public String updatePassword(String stud_id, String old_pwd, String new_pwd) throws StudException;
	
}
