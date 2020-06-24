package com.shetu.annotationBased;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load the config file
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextForAnnotation.xml");
		// retrieve the bean
		Coach myCoach = context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		boolean result = (myCoach == alphaCoach);
		System.out.println("Both of them are same Object? "+result);
		System.out.println("Memory Location - myCoach: "+myCoach);
		System.out.println("Memory Location - alphaCoach: "+alphaCoach);
		// close the context file
		context.close();
	}
	
}
