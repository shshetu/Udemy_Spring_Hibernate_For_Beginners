package com.shetu.practiceActivity5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {
	
	private FortuneService fortuneService;
	
	 // constructor injection
	 @Autowired 
	 public FootBallCoach(@Qualifier("randomFortuneService")FortuneService fortuneService) {
	  this.fortuneService = fortuneService; 
	  }
	 
	@Override
	public String getDailyWorkout() {
		return "Practice 100 goals to the bar";

	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
