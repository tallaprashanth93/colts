package com.colt.lbconnect.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Table(name="tbl_Lender")
@Entity
public class Lender {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer lenderId;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String emailId;
	
	@Column
	private Long mobile;
	
	@Column
	private Integer amount;

	public Integer getLenderId() {
		return lenderId;
	}

	public void setLenderId(Integer lenderId) {
		this.lenderId = lenderId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Lender [lenderId=" + lenderId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", mobile=" + mobile + ", amount=" + amount + "]";
	}
	
	


	
	
	

}
