package com.lti.scholarship.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="STUDENT_PDETAILS_EDETAILS")
public class StudentPersonalEducational {
	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="FORM_ID")
	private int formId;
	@Column(name="SCHEME_ID")
	private int schemeId;
	@Column(name="RELIGION")
	private String religion;
	@Column(name="COMMUNITY")
	private String community;
	@Column(name="FATHER_NAME")
	private String fatherName;
	@Column(name="MOTHER_NAME")
	private String motherName;
	@Column(name="FAMILY_INCOME")
	private int familyIncome;
	@Column(name="IS_DISABILITY")
	private int isDisability;
	@Column(name="PARENT_PROFESSION")
	private String parentProfession;
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
	public StudentPersonalEducational() {
		super();
	}
	public StudentPersonalEducational(int id, int formId, int schemeId, String religion, String community,
			String fatherName, String motherName, int familyIncome, int isDisability, String parentProfession,
			String sscPassingYear, int sscPercentage, String hscPassingYear, int hscPercentage, String instituteName,
			String currentCourse, String startDate, String universityName, int totalFees) {
		super();
		this.id = id;
		this.formId = formId;
		this.schemeId = schemeId;
		this.religion = religion;
		this.community = community;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.familyIncome = familyIncome;
		this.isDisability = isDisability;
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
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFormId() {
		return formId;
	}
	public void setFormId(int formId) {
		this.formId = formId;
	}
	public int getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
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
	public int getFamilyIncome() {
		return familyIncome;
	}
	public void setFamilyIncome(int familyIncome) {
		this.familyIncome = familyIncome;
	}
	public int getIsDisability() {
		return isDisability;
	}
	public void setIsDisability(int isDisability) {
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
	public int getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(int totalFees) {
		this.totalFees = totalFees;
	}
	@Override
	public String toString() {
		return "StudentPersonalEducational [id=" + id + ", formId=" + formId + ", schemeId=" + schemeId + ", religion="
				+ religion + ", community=" + community + ", fatherName=" + fatherName + ", motherName=" + motherName
				+ ", familyIncome=" + familyIncome + ", isDisability=" + isDisability + ", parentProfession="
				+ parentProfession + ", sscPassingYear=" + sscPassingYear + ", sscPercentage=" + sscPercentage
				+ ", hscPassingYear=" + hscPassingYear + ", hscPercentage=" + hscPercentage + ", instituteName="
				+ instituteName + ", currentCourse=" + currentCourse + ", startDate=" + startDate + ", universityName="
				+ universityName + ", totalFees=" + totalFees + "]";
	}
	
	
	
	

}
