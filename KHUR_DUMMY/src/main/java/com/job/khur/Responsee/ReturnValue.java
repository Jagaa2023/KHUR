package com.job.khur.Responsee;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReturnValue {
	
	

	String Source;
	
 
	String UserId;
	
	 
	String Function;
	
	 
	String SecurityCode;
	
	 
	String RequestType;
	
	 
	String RequestId;
	
	 
	String Status;
	
	 
	Response Response;
	
	
	public String getSource() {
		return Source;
	}
	
	
	@JsonProperty("Source")
	public void setSource(String source) {
		Source = source;
	}
	public String getUserId() {
		return UserId;
	}
	
	@JsonProperty("UserId")
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getFunction() {
		return Function;
	}
	
	
	@JsonProperty("Function")
	public void setFunction(String function) {
		Function = function;
	}
	public String getSecurityCode() {
		return SecurityCode;
	}
	
	
	@JsonProperty("SecurityCode")
	public void setSecurityCode(String securityCode) {
		SecurityCode = securityCode;
	}
	public String getRequestType() {
		return RequestType;
	}
	
	
	@JsonProperty("RequestType")
	public void setRequestType(String requestType) {
		RequestType = requestType;
	}
	public String getRequestId() {
		return RequestId;
	}
	
	
	@JsonProperty("RequestId")
	public void setRequestId(String requestId) {
		RequestId = requestId;
	}
	public String getStatus() {
		return Status;
	}
	
	
	@JsonProperty("Status")
	public void setStatus(String status) {
		Status = status;
	}
	public Response getResponse() {
		return Response;
	}
	
	
	@JsonProperty("Response")
	public void setResponse(Response response) {
		Response = response;
	}
	public ReturnValue(String source, String userId, String function, String securityCode, String requestType,
			String requestId, String status, com.job.khur.Responsee.Response response) {
		super();
		Source = source;
		UserId = userId;
		Function = function;
		SecurityCode = securityCode;
		RequestType = requestType;
		RequestId = requestId;
		Status = status;
		Response = response;
	}
	
	
	public ReturnValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	 

}
