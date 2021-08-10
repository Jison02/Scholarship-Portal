package com.lti.scholarship.beans;

public class StudentDocuments {
	
	private String domicile;
	private String incomeCertificate;
	private String passbook;
	private String aadharCard;
	private String sscMarksheet;
	private String hscMarkesheet;
	private int formId;
	
	public StudentDocuments() {
		super();
	}
	
	public StudentDocuments(String domicile, String incomeCertificate, String passbook, String aadharCard,
			String sscMarksheet, String hscMarkesheet, int formId) {
		super();
		this.domicile = domicile;
		this.incomeCertificate = incomeCertificate;
		this.passbook = passbook;
		this.aadharCard = aadharCard;
		this.sscMarksheet = sscMarksheet;
		this.hscMarkesheet = hscMarkesheet;
		this.formId = formId;
	}

	public String getDomicile() {
		return domicile;
	}
	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}
	public String getIncomeCertificate() {
		return incomeCertificate;
	}
	public void setIncomeCertificate(String incomeCertificate) {
		this.incomeCertificate = incomeCertificate;
	}
	public String getPassbook() {
		return passbook;
	}
	public void setPassbook(String passbook) {
		this.passbook = passbook;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public String getSscMarksheet() {
		return sscMarksheet;
	}
	public void setSscMarksheet(String sscMarksheet) {
		this.sscMarksheet = sscMarksheet;
	}
	public String getHscMarkesheet() {
		return hscMarkesheet;
	}
	public void setHscMarkesheet(String hscMarkesheet) {
		this.hscMarkesheet = hscMarkesheet;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	@Override
	public String toString() {
		return "StudentDocuments [domicile=" + domicile + ", incomeCertificate=" + incomeCertificate + ", passbook="
				+ passbook + ", aadharCard=" + aadharCard + ", sscMarksheet=" + sscMarksheet + ", hscMarkesheet="
				+ hscMarkesheet + ", formId=" + formId + "]";
	}
	
	

}
