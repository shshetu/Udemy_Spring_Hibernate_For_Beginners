package com.shetu.annotationBased;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	private FortuneService fortuneService;
	
	
	 public SwimCoach(FortuneService fortuneService) {
		 this.fortuneService = fortuneService;
	}
	 
	 
	public String getEmail() {
		return email;
	}


	public String getTeam() {
		return team;
	}


	@Override
	public String getDailyWorkout() {
		return "Do 1000 meter swim as a warmup";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	
}