package prodottiDto;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import lombok.Data;
import prodotti.Film;
import prodotti.Sale;

@Data
@SuppressWarnings("unused")
public class ProiezioniDto {

	
	private Film film;
	private Sale sala;
	private double incasso;
	private Date dataProiezione;
}
