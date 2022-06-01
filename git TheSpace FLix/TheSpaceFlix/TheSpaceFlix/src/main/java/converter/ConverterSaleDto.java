package converter;

import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import prodotti.Sale;
import prodottiDto.SaleDto;

@Component
public class ConverterSaleDto implements Converter<Sale,SaleDto> {

	/**utilizzato per evitare la lazy initialization*/
	@Override
	public SaleDto convert(Sale source) {
		SaleDto tab= new SaleDto();
		BeanUtils.copyProperties(source, tab);
		return tab;
	}
}