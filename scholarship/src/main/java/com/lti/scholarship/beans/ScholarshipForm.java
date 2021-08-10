package com.lti.scholarship.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCHOLARSHIP_FORM")
public class ScholarshipForm {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="FORM_ID")
	private int formId;
	@Column(name="STUDENT_ID")
	private int studentId;
	@Column(name="SCHEME_ID")
	private int schemeId;
	@Column(name="FORM_STATUS")
	private boolean formStatus;
	@Column(name="STUDENT_INSTITUTE_STATUS")
	private boolean studentInstituteStatus;
	public ScholarshipForm() {
		super();
	}
	public ScholarshipForm(int formId, int studentId, int schemeId, boolean formStatus,
			boolean studentInstituteStatus) {
		super();
		this.formId = formId;
		this.studentId = studentId;
		this.schemeId = schemeId;
		this.formStatus = formStatus;
		this.studentInstituteStatus = studentInstituteStatus;
	}
	public int getFormId() {
		return formId;
	}
	public void setFormId(int formId) {
		this.formId = formId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}
	public boolean isFormStatus() {
		return formStatus;
	}
	public void setFormStatus(boolean formStatus) {
		this.formStatus = formStatus;
	}
	public boolean isStudentInstituteStatus() {
		return studentInstituteStatus;
	}
	public void setStudentInstituteStatus(boolean studentInstituteStatus) {
		this.studentInstituteStatus = studentInstituteStatus;
	}
	@Override
	public String toString() {
		return "ScholarshipForm [formId=" + formId + ", studentId=" + studentId + ", schemeId=" + schemeId
				+ ", formStatus=" + formStatus + ", studentInstituteStatus=" + studentInstituteStatus + "]";
	}
	
	
	
	

}
