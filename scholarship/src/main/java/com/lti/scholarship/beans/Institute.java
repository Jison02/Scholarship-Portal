package com.lti.scholarship.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "INSTITUTE")
public class Institute {

	@Id
	private String inst_code;

	private String inst_name;

	private String inst_type;

	private String board_name;

	private String inst_pwd;

	private String proof_of_existence;

	private String affiliated_to;

	private String inst_state;

	private String inst_district;

	private String inst_addr;

	private String princi_name;

	private String phone_no;

	private String inst_status;

//	@OneToMany(mappedBy = "institute", cascade = CascadeType.ALL)
//	private List<Student> students;

	public Institute() {
		super();
	}

	public Institute(String inst_code, String inst_name, String inst_type, String board_name, String inst_pwd,
			String proof_of_existence, String affiliated_to, String inst_state, String inst_district, String inst_addr,
			String princi_name, String phone_no, String inst_status) {
		super();
		this.inst_code = inst_code;
		this.inst_name = inst_name;
		this.inst_type = inst_type;
		this.board_name = board_name;
		this.inst_pwd = inst_pwd;
		this.proof_of_existence = proof_of_existence;
		this.affiliated_to = affiliated_to;
		this.inst_state = inst_state;
		this.inst_district = inst_district;
		this.inst_addr = inst_addr;
		this.princi_name = princi_name;
		this.phone_no = phone_no;
		this.inst_status = inst_status;
	}

	public String getInst_code() {
		return inst_code;
	}

	public void setInst_code(String inst_code) {
		this.inst_code = inst_code;
	}

	public String getInst_name() {
		return inst_name;
	}

	public void setInst_name(String inst_name) {
		this.inst_name = inst_name;
	}

	public String getInst_type() {
		return inst_type;
	}

	public void setInst_type(String inst_type) {
		this.inst_type = inst_type;
	}

	public String getBoard_name() {
		return board_name;
	}

	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}

	public String getInst_pwd() {
		return inst_pwd;
	}

	public void setInst_pwd(String inst_pwd) {
		this.inst_pwd = inst_pwd;
	}

	public String getProof_of_existence() {
		return proof_of_existence;
	}

	public void setProof_of_existence(String proof_of_existence) {
		this.proof_of_existence = proof_of_existence;
	}

	public String getAffiliated_to() {
		return affiliated_to;
	}

	public void setAffiliated_to(String affiliated_to) {
		this.affiliated_to = affiliated_to;
	}

	public String getInst_state() {
		return inst_state;
	}

	public void setInst_state(String inst_state) {
		this.inst_state = inst_state;
	}

	public String getInst_district() {
		return inst_district;
	}

	public void setInst_district(String inst_district) {
		this.inst_district = inst_district;
	}

	public String getInst_addr() {
		return inst_addr;
	}

	public void setInst_addr(String inst_addr) {
		this.inst_addr = inst_addr;
	}

	public String getPrinci_name() {
		return princi_name;
	}

	public void setPrinci_name(String princi_name) {
		this.princi_name = princi_name;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getInst_status() {
		return inst_status;
	}

	public void setInst_status(String inst_status) {
		this.inst_status = inst_status;
	}

//	public List<Student> getStudents() {
//		return students;
//	}
//
//	public void setStudents(List<Student> students) {
//		this.students = students;
//	}

	@Override
	public String toString() {
		return "Institute [inst_code=" + inst_code + ", inst_name=" + inst_name + ", inst_type=" + inst_type
				+ ", board_name=" + board_name + ", inst_pwd=" + inst_pwd + ", proof_of_existence=" + proof_of_existence
				+ ", affiliated_to=" + affiliated_to + ", inst_state=" + inst_state + ", inst_district=" + inst_district
				+ ", inst_addr=" + inst_addr + ", princi_name=" + princi_name + ", phone_no=" + phone_no
				+ ", inst_status=" + inst_status + "]";
	}

}
