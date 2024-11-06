package com.job.khur.Responsee;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

	String type;
	int count;
	List<CitizenSalaryInfoResponse>  listData;
	
	
	public String getType() {
		return type;
	}
	
	@JsonProperty("@type")
	public void setType(String type) {
		this.type = type;
	}
	public int getCount() {
		return count;
	}
	
	@JsonProperty("count")
	public void setCount(int count) {
		this.count = count;
	}
	public List<CitizenSalaryInfoResponse> getListData() {
		return listData;
	}
	
	
	@JsonProperty("listData")
	public void setListData(List<CitizenSalaryInfoResponse> listData) {
		this.listData = listData;
	}
	public Response(String type, int count, List<CitizenSalaryInfoResponse> listData) {
		super();
		this.type = type;
		this.count = count;
		this.listData = listData;
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
