package prodottiDto;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;


@Data
@SuppressWarnings("unused")
public class SaleDto {

	private int posti;
	private String nome;
	private String citta;

	/**
	 * Le sale sono di 2 tipi: small(appartamenti a disposizione della compagnia per
	 * un massimo di 20 ospiti totali) e Mall(grandi sale nei centri commerciali)
	 */
	enum salaType {
		small, mall;
	}

}
