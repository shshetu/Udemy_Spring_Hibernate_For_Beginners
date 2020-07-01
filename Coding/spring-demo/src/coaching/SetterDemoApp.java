package coaching;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	// main method
	public static void main(String[] args) {
		
		// load the Spring container/ configuration 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean
		CricketCoach cricketCoach = context.getBean("cricketCoach",CricketCoach.class);
		
		// call the method
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		// close the config
		context.close();
	}
}
