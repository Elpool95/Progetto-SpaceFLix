package servizi;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
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

	/** ritornare i film dell'ultimo mese */
	public List<Film> ultimoMese() {
		ZonedDateTime local = LocalDateTime.now().atZone(ZoneId.systemDefault()).minus(Period.ofDays(30));
		long millis = local.toInstant().toEpochMilli();
		Date ultimoMese = new Date(millis);
		Date today = new Date(Calendar.getInstance().getTime().getTime());

		/*
		 * ZonedDateTime local2 = LocalDateTime.now().atZone(ZoneId.systemDefault());
		 * long millis2= local2.toInstant().toEpochMilli(); Date today= new
		 * Date(millis2);
		 */

		return film.findByDataUscita(ultimoMese);

	}

	public void noleggia() {

	}

}
