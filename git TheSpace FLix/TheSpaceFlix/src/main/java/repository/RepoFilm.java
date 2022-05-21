package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import prodotti.Film;

public interface RepoFilm extends JpaRepository<Film,String>{

	 //@Query(value = "SELECT * FROM contobanca WHERE cliente_cf = ?1",nativeQuery = true)
	
	@Query("SELECT titolo FROM Film WHERE  MAX(MONTH(dataUscita))")
	List<Film> findByDataUscita();
	
}
