package com.job.khur.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Table(name = "citizensalaryinfo"  

, uniqueConstraints=
{
		@UniqueConstraint(  columnNames = {
				"regnum", "month","year"
	  
				})
}  

		)
@Entity
public class CitizenSalaryInfo {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY   )
    @Column(nullable = false, name ="id")
    private long id;
	
	 
			
			
	@Column(name="type"  )
	String type;
	
	@Column(name="domName" )
	String domName;	
	
	@Column(name="month" )
	int month;	
	
	@Column(name="orgName" )
	String orgName;	
	
	
	@Column(name="orgSiID" )
	long orgSiID;	
	
	@Column(name="paid" )
	boolean paid;	
	
	@Column(name="salaryAmount" )
	double salaryAmount;
	
	@Column(name="salaryFee" )
	double salaryFee;	
	 
	
	@Column(name="year" )
	int year;
	
	
	@Column(name="regnum" )
	String regnum;
	
	


	public String getRegnum() {
		return regnum;
	}


	public void setRegnum(String regnum) {
		this.regnum = regnum;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDomName() {
		return domName;
	}


	public void setDomName(String domName) {
		this.domName = domName;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public String getOrgName() {
		return orgName;
	}


	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}


	public long getOrgSiID() {
		return orgSiID;
	}


	public void setOrgSiID(long orgSiID) {
		this.orgSiID = orgSiID;
	}


	public boolean isPaid() {
		return paid;
	}


	public void setPaid(boolean paid) {
		this.paid = paid;
	}


	public double getSalaryAmount() {
		return salaryAmount;
	}


	public void setSalaryAmount(double salaryAmount) {
		this.salaryAmount = salaryAmount;
	}


	public double getSalaryFee() {
		return salaryFee;
	}


	public void setSalaryFee(double salaryFee) {
		this.salaryFee = salaryFee;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public CitizenSalaryInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CitizenSalaryInfo(long id, String type, String domName, int month, String orgName, long orgSiID,
			boolean paid, double salaryAmount, double salaryFee, int year) {
		super();
		this.id = id;
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
	 
	
	

}
