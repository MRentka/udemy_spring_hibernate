package springdemo.annotations;

import java.util.Random;

public class FortuneServiceImpl implements FortuneService {

	private Random ran;
	public String[] fortunes = {":-) \"shadowing\" Happy Fortune!", ":-| \"shadowing\" Average day.", ":-( \"shadowing\" Out of Luck!"};
	
	public FortuneServiceImpl() {
		ran = new Random();
	}

	@Override
	public String getFortune() {
		return fortunes[ran.nextInt(fortunes.length)];
	}

}
