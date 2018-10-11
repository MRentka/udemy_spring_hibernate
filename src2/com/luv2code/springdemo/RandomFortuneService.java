package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {"Good Luck :-)", "Average Luck :-|", "Bad luck :-("};
	
	@Override
	public String getFortune() {
		Random ran = new Random();
		return fortunes[ran.nextInt(fortunes.length)];
	}

}
