package com.pack.model;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerBean 
{

	@NotEmpty
	@Size(min=4, max=10)
	private  String  firstName;
	
	
	@NotEmpty
	@Size(min=4, max=10)
	private  String  lastName;
	
	
	@NotEmpty
	@Email
	private  String  email;
	
	@NotEmpty
	@Size(min=8)
	@Pattern(regexp="^[a-z][a-z0-9@#$!]*")
	private  String  password;
	
	@NotNull
	private  Gender  gender;
	
	@NotEmpty
	private  String  country;
	
	private  Map<String,String>  countries=new  HashMap<String,String>();
	
	public  CustomerBean() {
		countries.put("INDIA", "INDIA");
		countries.put("AUSTRALIA", "AUSTRALIA");
		countries.put("SINGAPORE", "SINGAPORE");
		countries.put("CANADA", "CANADA");
		countries.put("USA", "USA");
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, String> getCountries() {
		return countries;
	}

	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}

}