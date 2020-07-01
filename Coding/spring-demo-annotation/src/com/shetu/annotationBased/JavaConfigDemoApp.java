package com.shetu.annotationBased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// load the config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		// retrieve the bean
		Coach myCoach = context.getBean("tennisCoach",Coach.class);
		
		// call the methods
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		// close the context file
		context.close();
	}
	
}
