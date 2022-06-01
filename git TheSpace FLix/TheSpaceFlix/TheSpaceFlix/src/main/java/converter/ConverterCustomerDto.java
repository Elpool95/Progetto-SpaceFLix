package converter;

import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import prodotti.Customer;
import prodottiDto.CustomerDto;

@Component
public class ConverterCustomerDto implements Converter<Customer,CustomerDto> {


		/**utilizzato per evitare la lazy initialization*/
		@Override
		public CustomerDto convert(Customer source) {
			CustomerDto tab= new CustomerDto();
			BeanUtils.copyProperties(source, tab);
			return tab;
		}

}
