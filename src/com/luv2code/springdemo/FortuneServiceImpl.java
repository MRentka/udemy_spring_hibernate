package com.luv2code.springdemo;

import java.util.Random;

public class FortuneServiceImpl implements FortuneService {

	private Random ran;
	
	public FortuneServiceImpl() {
		ran = new Random();
	}

	@Override
	public String getFortune() {
		return fortunes[ran.nextInt(fortunes.length)];
	}

}
