package com.lti.scholarship.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="STUD_ACADEMIC_DEMO")
public class StudentAcademic {
	
	@Column(name="SSC_YEAR")
	private int sscPassingYear;
	@Column(name="SSC_PERCENTAGE")
	private int sscPercentage;
	@Column(name="HSC_YEAR")
	private int hscPassingYear;
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
	private double totalFees;
	@Column(name="FORM_ID")
	private int formId;
	
	public StudentAcademic() {
		super();
	}
	
	public StudentAcademic(int sscPassingYear, int sscPercentage, int hscPassingYear, int hscPercentage,
			String instituteName, String currentCourse, String startDate, String universityName, double totalFees,
			int formId) {
		super();
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

	public int getSscPassingYear() {
		return sscPassingYear;
	}
	public void setSscPassingYear(int sscPassingYear) {
		this.sscPassingYear = sscPassingYear;
	}
	public int getSscPercentage() {
		return sscPercentage;
	}
	public void setSscPercentage(int sscPercentage) {
		this.sscPercentage = sscPercentage;
	}
	public int getHscPassingYear() {
		return hscPassingYear;
	}
	public void setHscPassingYear(int hscPassingYear) {
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
	public void setTotalFees(double totalFees) {
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
