package com.shetu.springdemo.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// add 3 annotations: constraint, retention, target

@Constraint(validatedBy = CourseConstraintValidatior.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
// value
	public String value() default "LUV";

	// message
	public String message() default "must start with LUV";

	// groups
	public Class<?>[] groups() default {};

	// payload
	public Class<? extends Payload>[] payload() default {};
}
