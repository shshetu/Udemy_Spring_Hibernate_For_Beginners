package com.shetu.annotationBased;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String data[] = {
			"Beaware of Wolf",
			"Deligence is the mother of good luck",
			"The Journey is the reward"
	};
	
	private Random random = new Random();
	
	@Override
	public String getDailyFortune() {
		int randomIndex = random.nextInt(data.length);
		String fortune = data[randomIndex];
		return fortune;
	}

}
