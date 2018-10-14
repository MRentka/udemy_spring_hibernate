package springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class); 
		Coach coach2 = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		
		context.close();	
	}

}


