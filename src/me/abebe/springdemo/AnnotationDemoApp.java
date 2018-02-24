package me.abebe.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
// read spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from a spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		// call method to the bean
		System.out.println(theCoach.getDailyWorkout());
		// close the context
		context.close();
	}

}
