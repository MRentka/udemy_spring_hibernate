package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from contaqiner
		Coach coach = context.getBean("myCoach", Coach.class);
		//call methods on bean
		System.out.println(coach.getDailyWorkout()); 
		System.out.println(coach.getDailyFortune());
		//close context
		context.close();
	}

}
