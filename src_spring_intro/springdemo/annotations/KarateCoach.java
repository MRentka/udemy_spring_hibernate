package springdemo.annotations;

import org.springframework.beans.factory.annotation.Value;

public class KarateCoach implements Coach {

	private FortuneService fortuneService;
	@Value("${boo.team}")
	private String team;
	@Value("${boo.email}")
	private String email;
	
	public KarateCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice Karate";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getTeam() {
		return team;
	}

	public String getEmail() {
		return email;
	}

}
