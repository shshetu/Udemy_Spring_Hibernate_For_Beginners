package com.shetu.springdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.shetu.springdemo.validation.CourseCode;

public class Customer {
	private String firstName;
	// last name with validation
	@NotNull(message = "Is required")
	@Size(min = 1, message = "Last Name should be atleast 4 characters")
	private String lastName;

	// free passes with validation
	@NotNull(message = "Is required")
	@Min(value = 0, message = "Value must be greater than or equal to 0")
	@Max(value = 10, message = "Value must be less than or equal to 10")
	private Integer freePasses;

	// reg expression field: postal code
	@Pattern(regexp = "^[a-zA-z0-9]{5}", message = "Only 5 chars/digits")
	private String postalCode;
	@CourseCode
	private String courseCode;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
