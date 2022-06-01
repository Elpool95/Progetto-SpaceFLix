package servizi;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaBuilder.In;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;
import prodotti.Film;
import prodottiDto.FilmDto;
import repository.RepoCustomer;
import repository.RepoFilm;

/**
 * un servizio di vendita di films in streaming(o dvd) che gestisce l'acquisto e
 * la visione di films come Netflix
 */

//@GetMapping({"/hello"})
//@RequestMapping("api")
//@RestController
//return new ResponseEntity<>(list, HttpStatus.OK);

@Service
@Slf4j
public class FilmServiceImpl implements FilmService {

	@Autowired
	RepoCustomer customer;

	@Autowired
	RepoFilm repoFilm;

	@Autowired
	Converter<Film, FilmDto> convFilm2Dto;

	@Autowired
	@Qualifier(value = "entityManagerFactory")
	EntityManager em;
	
	
	/**funzione per salvare film*/
	@Transactional
	public void update(Film film) {
		repoFilm.save(film);
	}
	
	/**funzione per leggere film dal titolo*/
	@Transactional
	public Film read(Film titolo) {
		repoFilm.findByTitolo(titolo);
		return titolo;
	}
	
	

	@Override
	@Transactional
	// forse meglio usare set per togliere duplicati
	public List<FilmDto> findFilmByTitoloCriteria(List<String> titolo) {
		List<FilmDto> films = new ArrayList<FilmDto>();
		CriteriaBuilder critbuild = em.getCriteriaBuilder();
		CriteriaQuery<Film> critquery = critbuild.createQuery(Film.class);
		Root<Film> root = critquery.from(Film.class);
		In<String> inclause = critbuild.in(root.get("titolo"));
		for (String it : titolo) {
			inclause.value(it);
		}
		for (Film title : em.createQuery(critquery.select(root).where(inclause)).getResultList())
			films.add(convFilm2Dto.convert(title));
		return films;
	}

	public List<FilmDto> getAllFilm(Integer pageNo, Integer pageSize, String sortBy) {
		Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
		Page<Film> pageResult = repoFilm.findAll(paging);
		if (pageResult.hasContent()) {
			return pageResult.getContent().stream().map(convFilm2Dto::convert).collect(Collectors.toList());
		}else {
		return new ArrayList<FilmDto>();
		}
	}

	/** ritornare i film dell'ultimo mese */
	public List<Film> ultimoMese() {
		ZonedDateTime local = LocalDateTime.now().atZone(ZoneId.systemDefault()).minus(Period.ofDays(30));
		long millis = local.toInstant().toEpochMilli();
		Date ultimoMese = new Date(millis);
		// Date today = new Date(Calendar.getInstance().getTime().getTime());
		return repoFilm.findByDataUscita(ultimoMese);
	}

}
