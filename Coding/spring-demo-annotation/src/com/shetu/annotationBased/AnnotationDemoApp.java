package com.shetu.annotationBased;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// load the config file
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextForAnnotation.xml");
		// retrieve the bean
		Coach myCoach = context.getBean("tennisCoach",Coach.class);
		// call the methods
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		// close the context file
		context.close();
	}
	
}
