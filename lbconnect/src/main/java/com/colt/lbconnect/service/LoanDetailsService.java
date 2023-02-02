package com.colt.lbconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colt.lbconnect.entities.LoanDetails;
import com.colt.lbconnect.repository.LoanDetailsRepository;

@Service
public class LoanDetailsService {
	
	@Autowired
	LoanDetailsRepository loanDetailsRepository;
	
	public Iterable<LoanDetails> getLoanDetails(){
		return loanDetailsRepository.findAll();
	}
	
	public LoanDetails saveLoanDetails(LoanDetails loanDetails) {
		return loanDetailsRepository.save(loanDetails);
	}
}
