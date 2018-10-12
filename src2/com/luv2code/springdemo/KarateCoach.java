package com.luv2code.springdemo;

public class KarateCoach implements Coach {

	private String email;
	private String team;
	private FortuneService fortuneService;
	
	public void init() {
		System.out.println("Init-Meth");
	}
	
	public void destroy() {
		System.out.println("Destroy-Meth");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Go to the Dojo!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
