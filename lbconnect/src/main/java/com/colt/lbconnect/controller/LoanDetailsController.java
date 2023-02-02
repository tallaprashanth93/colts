package com.colt.lbconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colt.lbconnect.entities.LoanDetails;
import com.colt.lbconnect.service.LoanDetailsService;

@RestController
@RequestMapping("/loans")
public class LoanDetailsController {
	
	@Autowired
	LoanDetailsService loanDetailsService;
	
	@GetMapping("/getLoans")
	public Iterable<LoanDetails> getLoans(){
		return loanDetailsService.getLoanDetails();
	}
	
	@PostMapping("/saveLoans")
	public LoanDetails saveloans(@RequestBody LoanDetails loanDetails) {
		return loanDetailsService.saveLoanDetails(loanDetails);
	}
}
