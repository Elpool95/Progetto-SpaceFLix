package boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import repository.RepoFilm;
import servizi.FilmService;

@Component
@Profile("dev")
public class RunnerDati implements CommandLineRunner{

	@Autowired
	RepoFilm repofilm;
	
	@Autowired
	FilmService filmservice;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("run RunnerDati");
		System.out.println(filmservice.ultimoMese());
		
	}

}
