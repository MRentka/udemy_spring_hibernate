package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		System.out.println("Same bean?: " + (alphaCoach == theCoach));
		System.out.println(theCoach.toString());
		System.out.println(alphaCoach.toString());
	}

}
