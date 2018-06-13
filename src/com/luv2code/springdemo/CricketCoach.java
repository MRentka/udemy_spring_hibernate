package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("Inside Cricket-Coach No-Arg Constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice cricket!";
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Cricket-Coach Fortune setter");
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside Cricket-Coach Email setter");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Inside Cricket-Coach Team setter");
		this.team = team;
	}

}
