package springdemo.demoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		// load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		// retrieve spring bean
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach fightingCoach = context.getBean("karateCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(fightingCoach.getDailyWorkout());
		
		context.close(); //destroy method is called if context is closed
	}

}
