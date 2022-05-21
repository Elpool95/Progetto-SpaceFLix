package prodotti;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**un cliente(privato o Compagnia) che vuol prenotare una sala per vedere un 
film con gli amici o pubblico pagante. */
@Entity
@Table(name = "proiezioni")

public class Proiezioni extends Generic{
	
	
	
	@OneToOne(cascade=CascadeType.PERSIST,fetch = FetchType.EAGER)
	private Film film;	
	
	@OneToOne(cascade=CascadeType.PERSIST,fetch = FetchType.EAGER)
	private Sale sala; 
	
	
	private double incasso; 
	private Date dataProiezione;
	
	
	@Override
	public String toString() {
		return "Proiezioni [ film=" + film + ", sala=" + sala + ", incasso="
				+ incasso + ", dataProiezione=" + dataProiezione + "]";
	}

	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public Sale getSala() {
		return sala;
	}
	public void setSala(Sale sala) {
		this.sala = sala;
	}
	public double getIncasso() {
		return incasso;
	}
	public void setIncasso(double incasso) {
		this.incasso = incasso;
	}
	public Date getDataProiezione() {
		return dataProiezione;
	}
	public void setDataProiezione(Date dataProiezione) {
		this.dataProiezione = dataProiezione;
	} 
	
	
	
}
