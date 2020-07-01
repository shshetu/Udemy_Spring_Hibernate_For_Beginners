package com.shetu.springdemo;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	private String[] operatingSystems;

// declare a linked HashMap
	private LinkedHashMap<String, String> countries;

	// declare radio button options
	private LinkedHashMap<String, String> favouriteLanguageOptions;
// initialize the linkedHashMap inside the default constructor
	public Student() {
		countries = new LinkedHashMap<String, String>();
		countries.put("BD", "Bangladesh");
		countries.put("BR", "Brazil");
		countries.put("IN", "India");
		countries.put("FR", "France");
		countries.put("US", "United States of America");
		
		// set radioOptions
		favouriteLanguageOptions = new LinkedHashMap<String, String>();
		favouriteLanguageOptions.put("Java", "Java");
		favouriteLanguageOptions.put("C#", "C#");
		favouriteLanguageOptions.put("PHP", "PHP");
		favouriteLanguageOptions.put("Python", "Python");
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
		return favouriteLanguageOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}



}
