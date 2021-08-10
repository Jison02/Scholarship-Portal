package com.lti.scholarship.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EDU_DETAILS")
public class StudentAcademic {
	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="SSC_YEAR")
	private String sscPassingYear;
	@Column(name="SSC_PERCENTAGE")
	private int sscPercentage;
	@Column(name="HSC_YEAR")
	private String hscPassingYear;
	@Column(name="HSC_PERCENTAGE")
	private int hscPercentage;
	@Column(name="INSTITUTE_NAME")
	private String instituteName;
	@Column(name="CURRENT_COURSE")
	private String currentCourse;
	@Column(name="START_DATE")
	private String startDate;
	@Column(name="UNIVERSITY_NAME")
	private String universityName;
	@Column(name="TOTAL_FEES")
	private int totalFees;
	@Column(name="FORM_ID")
	private int formId;
	
	public StudentAcademic() {
		super();
	}
	
	

	public StudentAcademic(int id, String sscPassingYear, int sscPercentage, String hscPassingYear, int hscPercentage,
			String instituteName, String currentCourse, String startDate, String universityName, int totalFees,
			int formId) {
		super();
		this.id = id;
		this.sscPassingYear = sscPassingYear;
		this.sscPercentage = sscPercentage;
		this.hscPassingYear = hscPassingYear;
		this.hscPercentage = hscPercentage;
		this.instituteName = instituteName;
		this.currentCourse = currentCourse;
		this.startDate = startDate;
		this.universityName = universityName;
		this.totalFees = totalFees;
		this.formId = formId;
	}



	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getSscPassingYear() {
		return sscPassingYear;
	}



	public void setSscPassingYear(String sscPassingYear) {
		this.sscPassingYear = sscPassingYear;
	}



	public int getSscPercentage() {
		return sscPercentage;
	}
	public void setSscPercentage(int sscPercentage) {
		this.sscPercentage = sscPercentage;
	}
	
	public String getHscPassingYear() {
		return hscPassingYear;
	}



	public void setHscPassingYear(String hscPassingYear) {
		this.hscPassingYear = hscPassingYear;
	}



	public int getHscPercentage() {
		return hscPercentage;
	}
	public void setHscPercentage(int hscPercentage) {
		this.hscPercentage = hscPercentage;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getCurrentCourse() {
		return currentCourse;
	}
	public void setCurrentCourse(String currentCourse) {
		this.currentCourse = currentCourse;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public double getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(int totalFees) {
		this.totalFees = totalFees;
	}
	
	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	@Override
	public String toString() {
		return "StudentAcademic [sscPassingYear=" + sscPassingYear + ", sscPercentage=" + sscPercentage
				+ ", hscPassingYear=" + hscPassingYear + ", hscPercentage=" + hscPercentage + ", instituteName="
				+ instituteName + ", currentCourse=" + currentCourse + ", startDate=" + startDate + ", universityName="
				+ universityName + ", totalFees=" + totalFees + ", formId=" + formId + "]";
	}

	
	
	
	
	

}
