package com.shetu.practiceActivity5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ActivityDemoApp {

	public static void main(String[] args) {
		// load the config file
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextForActivity.xml");
		// retrieve the bean
		Coach myCoach = context.getBean("footBallCoach",Coach.class);
		// call the methods
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		// close the context file
		context.close();
	}
	
}
