package coaching;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// create spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve the beans
		Coach coach = context.getBean("myCoach",Coach.class);
		// create an object of football coach
//		Coach footballCoach = context.getBean("footBallCoach",Coach.class);
		// call the getDailyWorkout() method
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		// call getDailyWorkout() for FootBallCoach Class
//		System.out.println(footballCoach.getDailyWorkout());
		//close the context
		context.close();

	}

}
