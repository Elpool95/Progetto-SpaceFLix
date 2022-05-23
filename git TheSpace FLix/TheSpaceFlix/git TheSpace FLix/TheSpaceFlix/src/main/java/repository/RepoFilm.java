package repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import prodotti.Film;

public interface RepoFilm extends JpaRepository<Film,String>{
	
	List<Film> findByDataUscita(Date ultimoMese);
	
}
