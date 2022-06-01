package converter;

import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import prodotti.Proiezioni;
import prodottiDto.ProiezioniDto;

@Component
public class ConverterProiezioniDto implements Converter<Proiezioni,ProiezioniDto> {

	/**utilizzato per evitare la lazy initialization*/
	@Override
	public ProiezioniDto convert(Proiezioni source) {
		ProiezioniDto tab= new ProiezioniDto();
		BeanUtils.copyProperties(source, tab);
		return tab;
	}
}