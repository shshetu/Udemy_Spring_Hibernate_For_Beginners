package coaching;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneDemoApp {
public static void main(String[] args) {
	// load the spring config file
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("randomFortuneApplicationContext.xml");
	// retrieve the bean
	Coach myCoach = context.getBean("myCoach",Coach.class);
	// call the method
	System.out.println(myCoach.getDailyWorkout());
	System.out.println(myCoach.getDailyFortune());
	// close the context
	context.close();
}
}
