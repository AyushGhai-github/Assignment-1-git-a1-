package com.washerDetails.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection = "washer")
public class Washers {
	private int washerId;
//	@Id
	private String userName;
	private String password;
	private String washerEmail;
	private String washerName;
	private String washerAddress;
	private double washerContactNo;
	private String role;
	
	public int getWasherId() {
		return washerId;
	}
	public void setWasherId(int washerId) {
		this.washerId = washerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getWasherEmail() {
		return washerEmail;
	}
	public void setWasherEmail(String washerEmail) {
		this.washerEmail = washerEmail;
	}
	public String getWasherName() {
		return washerName;
	}
	public void setWasherName(String washerName) {
		this.washerName = washerName;
	}
	public String getWasherAddress() {
		return washerAddress;
	}
	public void setWasherAddress(String washerAddress) {
		this.washerAddress = washerAddress;
	}
	public double getWasherContactNo() {
		return washerContactNo;
	}
	public void setWasherContactNo(double washerContactNo) {
		this.washerContactNo = washerContactNo;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Washers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Washers(int washerId, String userName, String password, String washerEmail, String washerName,
			String washerAddress, double washerContactNo, String role) {
		super();
		this.washerId = washerId;
		this.userName = userName;
		this.password = password;
		this.washerEmail = washerEmail;
		this.washerName = washerName;
		this.washerAddress = washerAddress;
		this.washerContactNo = washerContactNo;
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "Washers [washerId=" + washerId + ", userName=" + userName + ", password=" + password + ", washerEmail="
				+ washerEmail + ", washerName=" + washerName + ", washerAddress=" + washerAddress + ", washerContactNo="
				+ washerContactNo + ", role=" + role + "]";
	}
	
	
	


}
