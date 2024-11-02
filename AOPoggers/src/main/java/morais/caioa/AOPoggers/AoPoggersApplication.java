package morais.caioa.AOPoggers;

import morais.caioa.AOPoggers.dummy.DummyService;
import morais.caioa.AOPoggers.services.HelloService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AoPoggersApplication {

	public static void main(String[] args) {
		SpringApplication.run(AoPoggersApplication.class, args);
	}

	@Bean
	ApplicationRunner runner(HelloService hs, DummyService ds){
		return args -> {
			hs.hello();
			ds.dummy();
		};

	}
}
