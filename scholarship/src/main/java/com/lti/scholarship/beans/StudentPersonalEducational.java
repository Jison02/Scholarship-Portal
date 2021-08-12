package com.lti.scholarship.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="STUDENT_PDETAILS_EDETAILS")
public class StudentPersonalEducational {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="FORM_ID")
	private int formId;
	
	@Column(name="RELIGION")
	private String religion;
	
	@Column(name="COMMUNITY")
	private String community;
	
	@Column(name="FATHER_NAME")
	private String fatherName;
	
	@Column(name="MOTHER_NAME")
	private String motherName;
	
	@Column(name="FAMILY_INCOME")
	private String familyIncome;
	
	@Column(name="IS_DISABILITY")
	private String isDisability;
	
	@Column(name="DISABILITY_TYPE")
	private String disabilityType;
	
	@Column(name="PARENT_PROFESSION")
	private String parentProfession;
	
	@Column(name="SSC_YEAR")
	private String sscPassingYear;
	
	@Column(name="SSC_PERCENTAGE")
	private String sscPercentage;
	
	@Column(name="HSC_YEAR")
	private String hscPassingYear;
	
	@Column(name="HSC_PERCENTAGE")
	private String hscPercentage;
	
	@Column(name="INSTITUTE_NAME")
	private String instituteName;
	
	@Column(name="CURRENT_COURSE")
	private String currentCourse;
	
	@Column(name="START_DATE")
	private String startDate;
	
	@Column(name="UNIVERSITY_NAME")
	private String universityName;
	
	@Column(name="TOTAL_FEES")
	private String totalFees;
	
	@Column(name="STUD_ID")
	private String studId;

	@Column(name="SCHEME_ID")
	private int schemeId;
	

	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "stud_id")
//	@JsonIgnoreProperties("stud_id")
//	private Student student;
//	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="SCHEME_ID")
//	private ScholarshipSchemes scheme;
	
	public StudentPersonalEducational() {
		super();
	}

	
	
	

	public StudentPersonalEducational(int formId, String religion, String community, String fatherName, String motherName,
		String familyIncome, String isDisability, String disabilityType, String parentProfession, String sscPassingYear,
		String sscPercentage, String hscPassingYear, String hscPercentage, String instituteName, String currentCourse,
		String startDate, String universityName, String totalFees, String studId, int schemeId) {
	super();
	this.formId = formId;
	this.religion = religion;
	this.community = community;
	this.fatherName = fatherName;
	this.motherName = motherName;
	this.familyIncome = familyIncome;
	this.isDisability = isDisability;
	this.disabilityType = disabilityType;
	this.parentProfession = parentProfession;
	this.sscPassingYear = sscPassingYear;
	this.sscPercentage = sscPercentage;
	this.hscPassingYear = hscPassingYear;
	this.hscPercentage = hscPercentage;
	this.instituteName = instituteName;
	this.currentCourse = currentCourse;
	this.startDate = startDate;
	this.universityName = universityName;
	this.totalFees = totalFees;
	this.studId = studId;
	this.schemeId = schemeId;
}





	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFamilyIncome() {
		return familyIncome;
	}

	public void setFamilyIncome(String familyIncome) {
		this.familyIncome = familyIncome;
	}

	public String getIsDisability() {
		return isDisability;
	}

	public void setIsDisability(String isDisability) {
		this.isDisability = isDisability;
	}

	public String getParentProfession() {
		return parentProfession;
	}

	public void setParentProfession(String parentProfession) {
		this.parentProfession = parentProfession;
	}

	public String getSscPassingYear() {
		return sscPassingYear;
	}

	public void setSscPassingYear(String sscPassingYear) {
		this.sscPassingYear = sscPassingYear;
	}

	public String getSscPercentage() {
		return sscPercentage;
	}

	public void setSscPercentage(String sscPercentage) {
		this.sscPercentage = sscPercentage;
	}

	public String getHscPassingYear() {
		return hscPassingYear;
	}

	public void setHscPassingYear(String hscPassingYear) {
		this.hscPassingYear = hscPassingYear;
	}

	public String getHscPercentage() {
		return hscPercentage;
	}

	public void setHscPercentage(String hscPercentage) {
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

	public String getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(String totalFees) {
		this.totalFees = totalFees;
	}

//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}
//
//	public ScholarshipSchemes getScheme() {
//		return scheme;
//	}
//
//	public void setScheme(ScholarshipSchemes scheme) {
//		this.scheme = scheme;
//	}
	
	



	public String getDisabilityType() {
		return disabilityType;
	}

	public void setDisabilityType(String disabilityType) {
		this.disabilityType = disabilityType;
	}

	@Override
	public String toString() {
		return "StudentPersonalEducational [formId=" + formId + ", religion=" + religion + ", community=" + community
				+ ", fatherName=" + fatherName + ", motherName=" + motherName + ", familyIncome=" + familyIncome
				+ ", isDisability=" + isDisability + ", disabilityType=" + disabilityType + ", parentProfession="
				+ parentProfession + ", sscPassingYear=" + sscPassingYear + ", sscPercentage=" + sscPercentage
				+ ", hscPassingYear=" + hscPassingYear + ", hscPercentage=" + hscPercentage + ", instituteName="
				+ instituteName + ", currentCourse=" + currentCourse + ", startDate=" + startDate + ", universityName="
				+ universityName + ", totalFees=" + totalFees + "]";
	}

	
	
}
