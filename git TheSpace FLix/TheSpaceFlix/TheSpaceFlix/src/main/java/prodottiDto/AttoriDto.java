package prodottiDto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.Data;
import prodotti.Customer;
import prodotti.Film;

@Data
@SuppressWarnings("unused")
public class AttoriDto extends CustomerDto{
	
		private List<Film> film;
		
}
