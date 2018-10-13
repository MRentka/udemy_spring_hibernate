package springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		
		Coach theCoach = context.getBean(Coach.class);
		Coach alphaCoach = context.getBean(Coach.class);
		
		System.out.println("Memoryloc first:" + theCoach);
		System.out.println("Memoryloc second:" + alphaCoach);
		System.out.println("Same Object?: " + (theCoach == alphaCoach));
		
		context.close();
		
	}

}
