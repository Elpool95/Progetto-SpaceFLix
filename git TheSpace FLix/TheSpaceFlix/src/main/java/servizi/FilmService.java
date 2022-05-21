package servizi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prodotti.Film;
import repository.RepoCustomer;
import repository.RepoFilm;

/**
 * un servizio di vendita di films in streaming(o dvd) che gestisce l'acquisto e
 * la visione di films come Netflix
 */

@Service
public class FilmService {

	@Autowired
	RepoCustomer customer;
	
	@Autowired
	RepoFilm film;

	/**ritornare i film dell'ultimo mese */
	public List<Film> ultimoMese() {
		return film.findByDataUscita();
		
	}

	public void noleggia() {

	}

}
