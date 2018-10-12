package springdemo.annotations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class MyRandomFortuneService implements FortuneService {

	private String[] fortunes;
	private Random ran = new Random();
	
	@Override
	public String getFortune() {
		return fortunes[ran.nextInt(fortunes.length)];
	}

	@PostConstruct
	public void init() throws FileNotFoundException, IOException {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\raml1\\git\\udemy_spring_hibernate\\src\\fortunes.properties"));
			while(reader.readLine() != null) {
				String[] line = reader.readLine().split(",");
				for(int i = 0; i < line.length; i++) {
					fortunes[i] = line[i];
				}
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
