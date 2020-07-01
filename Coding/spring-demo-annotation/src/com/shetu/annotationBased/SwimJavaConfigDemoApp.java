package com.shetu.annotationBased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// load the config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		// retrieve the bean
		SwimCoach myCoach = context.getBean("swimCoach",SwimCoach.class);
		
		// call the methods
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		System.out.println(myCoach.getEmail());
		System.out.println(myCoach.getTeam());
		// close the context file
		context.close();
	}
	
}
