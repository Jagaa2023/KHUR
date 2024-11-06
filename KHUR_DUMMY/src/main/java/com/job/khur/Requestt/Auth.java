package com.job.khur.Requestt;

public class Auth {
	
	Citizen citizen;
	Operator operator;
	public Citizen getCitizen() {
		return citizen;
	}
	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public Auth(Citizen citizen, Operator operator) {
		super();
		this.citizen = citizen;
		this.operator = operator;
	}
	public Auth() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
