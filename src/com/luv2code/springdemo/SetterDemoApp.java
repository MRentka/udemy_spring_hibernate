package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load the spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		KarateCoach karateCoach = context.getBean("myKarateCoach", KarateCoach.class);
		
		// call methods on bean
		// ... later
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		System.out.println(karateCoach.getDailyWorkout());
		System.out.println(karateCoach.getDailyFortune());
		// close context
		context.close();
		
	}

}
