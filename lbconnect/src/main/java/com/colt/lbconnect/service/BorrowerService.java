package com.colt.lbconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colt.lbconnect.entities.Borrower;
import com.colt.lbconnect.repository.BorrowerRepository;
@Service
public class BorrowerService {

	@Autowired
	BorrowerRepository borrowerRepository;
	
	public Iterable<Borrower> getBorrowers() {
		// TODO Auto-generated method stub
		return borrowerRepository.findAll();
	}

	public Borrower saveBorrower(Borrower borrower) {
		// TODO Auto-generated method stub
		return borrowerRepository.save(borrower);
	}
}
