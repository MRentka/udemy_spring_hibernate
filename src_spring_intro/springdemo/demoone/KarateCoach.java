package springdemo.demoone;

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
	
	public void initBean() {
		System.out.println("Init Karate-Coach Bean");
	}
	
	public void destroyBean() {
		System.out.println("Destroy Karate-Coach Bean");
	}

}
