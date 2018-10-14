package springdemo.annotations;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
		"Unlucky :-(",
		"Lucky :-)",
		"Average :-|"
	};
	
	private Random ran = new Random();

	@Override
	public String getFortune() {
		return data[ran.nextInt(data.length)];
	}
	
	@PostConstruct
	public void init() {
		System.out.println(">> randomFortuneService init()");
	}
}


