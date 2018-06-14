package com.luv2code.springdemo;

public class KarateCoach implements Coach {

private FortuneService fortuneService;
	
	public KarateCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice Kumite in the Dojo.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
