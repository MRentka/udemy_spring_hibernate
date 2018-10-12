package springdemo.annotations;

import java.io.File;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		
		Coach theCoach = context.getBean(Coach.class);
		Coach alphaCoach = context.getBean(Coach.class);
		
		File file = new File("C:\\Users\\raml1\\git\\udemy_spring_hibernate\\src\\fortunes.properties");
		for(String fileNames : file.list()) System.out.println(fileNames);
		System.out.println("Memoryloc first:" + theCoach);
		System.out.println("Memoryloc second:" + alphaCoach);
		System.out.println("Same Object?: " + (theCoach == alphaCoach));
		
		context.close();	
	}

}


