package com.colt.lbconnect.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_borrower")
public class Borrower {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int borrowerId;
	
	@Column
	private String borrowerName;
	
	@Column
	private LocalDate dob;
	
	@Column
	private String emailId;
	
	@Column
	private String address;
	
	@Column
	private String nominee;
	
	@Column
	private long mobile;
	
	@Column
	private int score;

	@Column
	private int eligibility;
	
	@Column
	private boolean activeLoans;

	public int getborrowerId() {
		return borrowerId;
	}

	public void setborrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}

	public String getborrowerName() {
		return borrowerName;
	}

	public void setborrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getEligibility() {
		return eligibility;
	}

	public void setEligibility(int eligibility) {
		this.eligibility = eligibility;
	}

	public boolean isActiveLoans() {
		return activeLoans;
	}

	public void setActiveLoans(boolean activeLoans) {
		this.activeLoans = activeLoans;
	}
	
	
	
}
