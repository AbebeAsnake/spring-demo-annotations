package me.abebe.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach {
private FortuneService fortuneService;
@Autowired
public TennisCoach(FortuneService theFortuneService) {
	fortuneService = theFortuneService;
}

//define a default constructor
public TennisCoach() {
	System.out.println(">>TennisCoach:  inside default constructor");
}
// define a setter method
public void setFortuneService(FortuneService theFortuneService) {
	System.out.println(">> TennisCoach: inside setFortuneService() method");
	fortuneService = theFortuneService;
}
	@Override
	public String getDailyWorkout() {
		
		return "practice your bakhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	

}
