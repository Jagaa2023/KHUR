package com.job.khur.Responsee;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CitizenSalaryInfoResponse {
	
	 
			
	 
	String type;
	
	 
	String domName;	
	
	 
	int month;	
	
	 
	String orgName;	
	
	
	 
	long orgSiID;	
	
	 
	boolean paid;	
	
	 
	double salaryAmount;
	
	 
	double salaryFee;	
	 
	
	 
	int year;



	public String getType() {
		return type;
	}


	@JsonProperty("@type")
	public void setType(String type) {
		this.type = type;
	}



	public String getDomName() {
		return domName;
	}


	@JsonProperty("domName")
	public void setDomName(String domName) {
		this.domName = domName;
	}



	public int getMonth() {
		return month;
	}


	@JsonProperty("month")
	public void setMonth(int month) {
		this.month = month;
	}



	public String getOrgName() {
		return orgName;
	}


	@JsonProperty("orgName")
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}



	public long getOrgSiID() {
		return orgSiID;
	}


	@JsonProperty("orgSiID")
	public void setOrgSiID(long orgSiID) {
		this.orgSiID = orgSiID;
	}



	public boolean isPaid() {
		return paid;
	}


	@JsonProperty("paid")
	public void setPaid(boolean paid) {
		this.paid = paid;
	}



	public double getSalaryAmount() {
		return salaryAmount;
	}


	@JsonProperty("salaryAmount")
	public void setSalaryAmount(double salaryAmount) {
		this.salaryAmount = salaryAmount;
	}



	public double getSalaryFee() {
		return salaryFee;
	}


	@JsonProperty("salaryFee")
	public void setSalaryFee(double salaryFee) {
		this.salaryFee = salaryFee;
	}



	public int getYear() {
		return year;
	}



	 


	@JsonProperty("year")
	public void setYear(int year) {
		this.year = year;
	}


	public CitizenSalaryInfoResponse(String type, String domName, int month, String orgName, long orgSiID, boolean paid,
			double salaryAmount, double salaryFee, int year) {
		super();
		this.type = type;
		this.domName = domName;
		this.month = month;
		this.orgName = orgName;
		this.orgSiID = orgSiID;
		this.paid = paid;
		this.salaryAmount = salaryAmount;
		this.salaryFee = salaryFee;
		this.year = year;
	}



	public CitizenSalaryInfoResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

 
	 
	
	

}
