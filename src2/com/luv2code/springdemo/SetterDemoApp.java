package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);
		
		for(int i = 0; i < 100; i++) {System.out.println(coach.getDailyFortune());}	
//		System.out.println(coach.getDailyWorkout());
//		System.out.println(coach.getEmailAddress());
//		System.out.println(coach.getTeam());
		
		context.close();

	}

}
