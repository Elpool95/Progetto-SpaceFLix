package prodotti;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

/**un cliente(privato o Compagnia) che vuol prenotare una sala per vedere un 
film con gli amici o pubblico pagante. */
@Entity
@Table(name = "proiezioni")
@Data
@SuppressWarnings("unused")
public class Proiezioni extends Generic{
	
	
	
	@OneToOne(cascade=CascadeType.PERSIST,fetch = FetchType.EAGER)
	private Film film;	
	
	@OneToOne(cascade=CascadeType.PERSIST,fetch = FetchType.EAGER)
	private Sale sala; 
	
	
	private double incasso; 
	private Date dataProiezione;
	

	
	
}
