package com.shetu.springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseConstraintValidatior implements ConstraintValidator<CourseCode, String> {
	// course Prefix
	private String coursePrefix;

	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
		boolean result;
		if (code != null) {
			result = code.startsWith(coursePrefix);
		}else {
			return true;
		}

		return result;
	}

}
