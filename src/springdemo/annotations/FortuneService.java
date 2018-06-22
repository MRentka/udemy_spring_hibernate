package springdemo.annotations;

public interface FortuneService {
	
	public String[] fortunes = {":-) Fortune!", ":-| Average day.", ":-( Out of Luck!"};

	public String getFortune();	
}
