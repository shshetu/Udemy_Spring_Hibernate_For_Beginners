package coaching;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");
		// retrieve the bean 
		Coach myCoach = context.getBean("myCoach",Coach.class);
		// call the required methods
		System.out.println(myCoach.getDailyWorkout());
		// close the context
		context.close();

	}

}
