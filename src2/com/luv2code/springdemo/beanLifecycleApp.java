package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifecycleApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycleAppCont.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach karateCoach = context.getBean("karateCoach", KarateCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(karateCoach.getDailyWorkout());
		
		context.close();
	}

}
