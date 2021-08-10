package com.lti.scholarship.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS_DETAILS")
public class StudentAddress {
	@Id
	@Column(name="ADDRESS_ID")
	private int addressId;
	
	@Column(name="STATE")
	private String state;
	@Column(name="DISTRICT")
	private String district;
	@Column(name="CITY")
	private String city;
	@Column(name="FORM_ID")
	private int formId;
	public StudentAddress() {
		super();
	}
	public StudentAddress(String state, String district, String city, int formId) {
		super();
		this.state = state;
		this.district = district;
		this.city = city;
		this.formId = formId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getFormId() {
		return formId;
	}
	public void setFormId(int formId) {
		this.formId = formId;
	}
	@Override
	public String toString() {
		return "StudentAddress [state=" + state + ", district=" + district + ", city=" + city + ", formId=" + formId
				+ "]";
	}
	
	

}
