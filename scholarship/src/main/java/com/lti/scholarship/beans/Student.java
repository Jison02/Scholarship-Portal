package com.lti.scholarship.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	private String stud_id;

	private String stud_name;
	private String dob;
	private String gender;
	private String mob_no;
	private String stud_email_id;
	private String stud_pwd;
	private String state_of_domicile;
	private String district;
	private String bank_acc_no;
	private String bank_ifsc;
	private String inst_code;

//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "inst_code")
//	@JsonIgnoreProperties("inst_code")
//	private Institute institute;
	
//	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
//	private List<StudentPersonalEducational> studentDetails;

	public Student() {
		super();
	}

	public Student(String stud_id, String stud_name, String dob, String gender, String mob_no, String stud_email_id,
			String stud_pwd, String state_of_domicile, String district, String bank_acc_no, String bank_ifsc) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.dob = dob;
		this.gender = gender;
		this.mob_no = mob_no;
		this.stud_email_id = stud_email_id;
		this.stud_pwd = stud_pwd;
		this.state_of_domicile = state_of_domicile;
		this.district = district;
		this.bank_acc_no = bank_acc_no;
		this.bank_ifsc = bank_ifsc;
	}

	public String getStud_id() {
		return stud_id;
	}

	public void setStud_id(String stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMob_no() {
		return mob_no;
	}

	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}

	public String getStud_email_id() {
		return stud_email_id;
	}

	public void setStud_email_id(String stud_email_id) {
		this.stud_email_id = stud_email_id;
	}

	public String getStud_pwd() {
		return stud_pwd;
	}

	public void setStud_pwd(String stud_pwd) {
		this.stud_pwd = stud_pwd;
	}

	public String getState_of_domicile() {
		return state_of_domicile;
	}

	public void setState_of_domicile(String state_of_domicile) {
		this.state_of_domicile = state_of_domicile;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBank_acc_no() {
		return bank_acc_no;
	}

	public void setBank_acc_no(String bank_acc_no) {
		this.bank_acc_no = bank_acc_no;
	}

	public String getBank_ifsc() {
		return bank_ifsc;
	}

	public void setBank_ifsc(String bank_ifsc) {
		this.bank_ifsc = bank_ifsc;
	}
	
	

//	public Institute getInstitute() {
//		return institute;
//	}
//
//	public void setInstitute(Institute institute) {
//		this.institute = institute;
//	}
//
//	public List<StudentPersonalEducational> getStudentDetails() {
//		return studentDetails;
//	}
//
//	public void setStudentDetails(List<StudentPersonalEducational> studentDetails) {
//		this.studentDetails = studentDetails;
//	}

	public String getInst_code() {
		return inst_code;
	}

	public void setInst_code(String inst_code) {
		this.inst_code = inst_code;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", dob=" + dob + ", gender=" + gender
				+ ", mob_no=" + mob_no + ", stud_email_id=" + stud_email_id + ", stud_pwd=" + stud_pwd
				+ ", state_of_domicile=" + state_of_domicile + ", district=" + district + ", bank_acc_no=" + bank_acc_no
				+ ", bank_ifsc=" + bank_ifsc + ", inst_code=" + inst_code + "]";
	}

	

	

}
