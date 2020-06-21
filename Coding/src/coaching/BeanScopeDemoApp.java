package coaching;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		// retrieve the bean 
		Coach myCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach =  context.getBean("myCoach",Coach.class);
		// call the required methods
		boolean result = (myCoach == alphaCoach);
		System.out.println("Point to the same object: "+ result);
		System.out.println("Memory Location of myCoach: "+myCoach);
		System.out.println("Memory Location of alphaCoach: "+alphaCoach);
		// close the context
		context.close();

	}

}
