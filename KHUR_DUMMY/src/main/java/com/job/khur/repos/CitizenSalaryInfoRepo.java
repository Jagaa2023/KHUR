package com.job.khur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.job.khur.models.CitizenSalaryInfo;

public interface CitizenSalaryInfoRepo extends JpaRepository<CitizenSalaryInfo, Long> {
	
	
	List<CitizenSalaryInfo> findByRegnumAndYearBetween(String regnum, int syear, int eyear);

}
