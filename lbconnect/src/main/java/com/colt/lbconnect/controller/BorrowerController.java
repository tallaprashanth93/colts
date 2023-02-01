package com.colt.lbconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colt.lbconnect.entities.Borrower;
import com.colt.lbconnect.service.BorrowerService;

@RestController
@RequestMapping("/borrower")
public class BorrowerController {
	@Autowired
	BorrowerService borrowerService;
	
	@GetMapping("/getBorrowers")
	public Iterable<Borrower> getAll() {
		return borrowerService.getBorrowers();
	}
	
	@PostMapping("/saveBorrower")
	public Borrower saveBorrower(@RequestBody Borrower borrower) {
		return borrowerService.saveBorrower(borrower);
	}

}
