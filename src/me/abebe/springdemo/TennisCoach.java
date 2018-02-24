package me.abebe.springdemo;

import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "practice your bakhand volley";
	}

}
