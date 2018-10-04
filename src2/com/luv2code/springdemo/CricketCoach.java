package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("cCoach no-arg constr");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice Cricket!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setter for FortuneService on cCoach");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		System.out.println("getter mail");
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("setter mail");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		System.out.println("getter team");
		return team;
	}

	public void setTeam(String team) {
		System.out.println("setter team");
		this.team = team;
	}

}
