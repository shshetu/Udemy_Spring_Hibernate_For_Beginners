package com.shetu.annotationBased;

public class SadFortuneService implements FortuneService{

	@Override
	public String getDailyFortune() {
		return "Today is a Sad Day!";
	}

}
