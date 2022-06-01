package converter;

import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import prodotti.Attori;
import prodottiDto.AttoriDto;

@Component
public class ConverterAttoriDto implements Converter<Attori,AttoriDto> {


	/**utilizzato per evitare la lazy initialization*/
	@Override
	public AttoriDto convert(Attori source) {
		AttoriDto tab= new AttoriDto();
		BeanUtils.copyProperties(source, tab);
		return tab;
	}
}

