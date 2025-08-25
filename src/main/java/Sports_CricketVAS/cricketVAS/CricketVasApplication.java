package Sports_CricketVAS.cricketVAS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"controller", "service", "classes", "Sports_CricketVAS.cricketVAS"})
public class CricketVasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketVasApplication.class, args);
	}

}
