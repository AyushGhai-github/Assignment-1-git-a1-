package com.springboot.assignmnet3;

public class User_information {
	private String state;
	private String city;
	private String Country;
	private int Zipcode;
	public User_information(String state, String city, String country, int zipcode) {
		super();
		this.state = state;
		this.city = city;
		this.Country = country;
		this.Zipcode = zipcode;
	}
	public User_information() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getZipcode() {
		return Zipcode;
	}
	public void setZipcode(int zipcode) {
		Zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "User_information [state=" + state + ", city=" + city + ", Country=" + Country + ", Zipcode=" + Zipcode
				+ "]";
	}
	
	

}
