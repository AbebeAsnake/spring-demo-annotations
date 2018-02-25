package me.abebe.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach {
@Autowired
@Qualifier("randomFortuneService")
private FortuneService fortuneService;
//@Autowired
public TennisCoach(FortuneService theFortuneService) {
	fortuneService = theFortuneService;
}

//define a default constructor
public TennisCoach() {
	System.out.println(">>TennisCoach:  inside default constructor");
}
// define a setter method
/*@Autowired
public void doSomeCrazyStuff(FortuneService theFortuneService) {
	System.out.println(">> TennisCoach: inside doSomethingCrazyStuff() method");
	fortuneService = theFortuneService;
}*/
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
