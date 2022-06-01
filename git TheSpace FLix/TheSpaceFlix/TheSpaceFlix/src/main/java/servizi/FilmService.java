package servizi;

import java.util.List;

import prodottiDto.FilmDto;


public interface FilmService  {
	List<FilmDto> findFilmByTitoloCriteria (List<String> titolo);
	public List<FilmDto> getAllFilm(Integer pageNo, Integer pageSize, String sortBy);
}
