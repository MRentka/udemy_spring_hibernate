package springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KarateMain {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KarateConfig.class);
		KarateCoach coach = context.getBean("karateCoach", KarateCoach.class);
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		
		context.close();
	}
	
}
