package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("repository")
@ComponentScan(basePackages = {"servizi"})
@EntityScan({"prodotti"})
@SpringBootApplication
public class TheSpaceFlixApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheSpaceFlixApplication.class, args);
	}

}
