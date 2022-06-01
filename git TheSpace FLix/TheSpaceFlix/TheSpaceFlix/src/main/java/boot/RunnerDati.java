package boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import repository.RepoFilm;
import servizi.FilmServiceImpl;

@Component
@Profile("dev")
public class RunnerDati implements CommandLineRunner{

	@Autowired
	RepoFilm repofilm;
	
	@Autowired
	FilmServiceImpl filmservice;
	
	
	 //possiamo fare delle save per popolare un po il db 
	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("run RunnerDati");
		System.out.println(filmservice.ultimoMese());
		
	}

}
