package prodotti;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Entity
@Table(name = "sala")
@Data
@SuppressWarnings("unused")
public class Sale extends Generic {

	@Autowired
	private int posti;
	@Autowired
	private String nome;
	@Autowired
	private String citta;

	/**
	 * Le sale sono di 2 tipi: small(appartamenti a disposizione della compagnia per
	 * un massimo di 20 ospiti totali) e Mall(grandi sale nei centri commerciali)
	 */
	enum salaType {
		small, mall;
	}


}
