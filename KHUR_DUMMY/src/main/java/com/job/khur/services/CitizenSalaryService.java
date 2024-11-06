package com.job.khur.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.khur.Responsee.CitizenSalaryInfoResponse;
import com.job.khur.models.CitizenSalaryInfo;
import com.job.khur.repos.CitizenSalaryInfoRepo;

@Service
public class CitizenSalaryService {
	
	
	@Autowired
	CitizenSalaryInfoRepo  salaryRepo;
	
	
	
	public List<CitizenSalaryInfoResponse> getSalaryInfo(String regnum, int syear, int eyear) {
		
	 
		
		List<CitizenSalaryInfoResponse> returnVal = new ArrayList<>();
		
		
		salaryRepo.findByRegnumAndYearBetween(regnum, syear, eyear).forEach( e->{
			
			
			CitizenSalaryInfoResponse tmp = new CitizenSalaryInfoResponse();
			
			tmp.setDomName( e.getDomName());
			tmp.setMonth(e.getMonth());
			tmp.setYear( e.getYear());
			tmp.setOrgName(e.getOrgName());
			tmp.setOrgSiID(e.getOrgSiID());
			tmp.setPaid(e.isPaid());
			tmp.setSalaryAmount(e.getSalaryAmount());
			tmp.setSalaryFee(e.getSalaryFee());
			tmp.setType( e.getType());
	 	
			
			returnVal.add( tmp  );
			
			
		});
		
		
		
		 
		return returnVal;
		
	}
	
	

}
