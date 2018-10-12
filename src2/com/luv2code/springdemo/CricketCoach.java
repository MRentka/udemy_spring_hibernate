package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String mail;
	private String team;
	
	public CricketCoach() {
	}

	public void init() {
		System.out.println("Init-Meth");
	}
	
	public void destroy() {
		System.out.println("Destroy-Meth");
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
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		System.out.println("getter mail");
		return mail;
	}

	public void setEmailAddress(String emailAddress) {
		this.mail = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
