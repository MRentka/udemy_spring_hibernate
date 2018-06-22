package springdemo.annotations;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Get running slub!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void initBean() {
		System.out.println("Init TrackCoach Bean");
	}

	public void cleanUpBean() {
		System.out.println("Destroy trackCoach Bean");
	}
}
