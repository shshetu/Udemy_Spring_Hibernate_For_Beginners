package com.shetu.annotationBased;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is Vacation Day!";
	}

}
