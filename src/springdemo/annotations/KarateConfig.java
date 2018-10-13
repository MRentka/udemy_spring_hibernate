package springdemo.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class KarateConfig {

	@Bean
	public KarateFortuneService karateFortuneService() {
		return new KarateFortuneService();
	}
	
	@Bean
	public KarateCoach karateCoach() {
		return new KarateCoach(karateFortuneService());
	}
}
