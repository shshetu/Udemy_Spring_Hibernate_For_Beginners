package com.shetu.annotationBased;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	// Field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// Post Construct
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Inside doMyStartupStuff() method");
	}
	
	// Pre Destroy
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Inside doMyCleanupStuff() method");	
	}

	/*// constructor injection
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
	
	// default constructor
	public TennisCoach() {
		System.out.println("Inside Default Constructor");
		
	}
	// setter injection
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println("Inside Setter method"); this.fortuneService =
	 * fortuneService; }
	 */
	
	// method injection
	/*
	 * @Autowired public void doSomeCrazyStuff(FortuneService fortuneService) {
	 * System.out.println("Inside doSomeCrazyStuff() method"); this.fortuneService =
	 * fortuneService; }
	 */
	
	@Override
	public String getDailyWorkout() {
		return "Practice Backhand Volly for 1 hour";

	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
