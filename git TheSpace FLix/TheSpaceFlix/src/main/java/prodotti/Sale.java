package prodotti;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "sala")
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

	public Sale() {
	}

	@Override
	public String toString() {
		return "Sale [posti=" + posti + ", nome=" + nome + ", citta=" + citta + "]";
	}

	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

}
