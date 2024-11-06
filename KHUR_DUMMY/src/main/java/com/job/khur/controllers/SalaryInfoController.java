package com.job.khur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.job.khur.Requestt.Req;
import com.job.khur.Responsee.Response;
import com.job.khur.Responsee.ReturnValue;
import com.job.khur.services.CitizenSalaryService; 

@RequestMapping("/services")
@RestController
@CrossOrigin(origins = { "*" })
public class SalaryInfoController {

	
	@Autowired
	CitizenSalaryService  salServ;
	
	@GetMapping("getCitizenSalaryInfo")
	public  ResponseEntity<ReturnValue> getData(@RequestBody Req request) {
				
		ReturnValue returnVal = new ReturnValue();
		Response rsp = new Response();
		
		
		rsp.setType("ns0:ListWrapper");
		rsp.setCount(0); 
		
		 
		
		rsp.setListData(salServ.getSalaryInfo(request.getRegnum(), Integer.parseInt( request.getSyear()),  Integer.parseInt(request.getEyear()) ));
		
		
		returnVal.setSource("SCO");
		returnVal.setUserId("devtest");
		returnVal.setFunction("getCitizenSalaryInfo");
		returnVal.setSecurityCode("C012F72C5CC82CCBC62973934EFDCCF4");
		returnVal.setRequestId("739afc83-58f4-b13f-d701 12fa0f773b19");
		returnVal.setRequestType("A");
		returnVal.setStatus("SUCCESS"); 
		returnVal.setResponse(rsp);
		
		 
		return ResponseEntity.ok(returnVal);
		
		
	}
	
}
