package springdemo.annotations;

public class KarateFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Good Mojo in the Dojo!";
	}

}
