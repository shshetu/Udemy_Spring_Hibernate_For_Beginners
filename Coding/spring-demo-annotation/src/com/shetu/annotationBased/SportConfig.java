package com.shetu.annotationBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class SportConfig {

		// create bean of sad fortune service and inject dependency
			@Bean
			public FortuneService sadFortuneService() {
				return new SadFortuneService();
			}
			
		// create bean of swim coach
		@Bean
		public Coach swimCoach() {
			return new SwimCoach(sadFortuneService());
		}
		
		
}
