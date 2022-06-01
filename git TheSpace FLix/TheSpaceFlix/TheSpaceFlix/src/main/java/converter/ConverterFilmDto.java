package converter;

import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import prodotti.Film;
import prodottiDto.FilmDto;

@Component
public class ConverterFilmDto implements Converter<Film,FilmDto> {

	/**utilizzato per evitare la lazy initialization*/
	@Override
	public FilmDto convert(Film source) {
		FilmDto tab= new FilmDto();
		BeanUtils.copyProperties(source, tab);
		return tab;
	}
	
	
}
