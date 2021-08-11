package com.lti.scholarship.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCHOLARSHIP_SCHEME")
public class ScholarshipSchemes {
	
	@Id
	@Column(name="SCHEME_ID")
	private int schemeId;
	@Column(name="SCHEME_NAME")
	private String schemeName;
	@Column(name="SCHEME_AMOUNT")
	private int schemeAmount;
	public ScholarshipSchemes() {
		super();
	}
	public ScholarshipSchemes(int schemeId, String schemeName, int schemeAmount) {
		super();
		this.schemeId = schemeId;
		this.schemeName = schemeName;
		this.schemeAmount = schemeAmount;
	}
	public int getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public double getSchemeAmount() {
		return schemeAmount;
	}
	public void setSchemeAmount(int schemeAmount) {
		this.schemeAmount = schemeAmount;
	}
	@Override
	public String toString() {
		return "ScholarshipSchemes [schemeId=" + schemeId + ", schemeName=" + schemeName + ", schemeAmount="
				+ schemeAmount + "]";
	}
	

}
