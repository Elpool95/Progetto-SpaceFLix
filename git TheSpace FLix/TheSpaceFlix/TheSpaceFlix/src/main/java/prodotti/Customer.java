package prodotti;

import java.sql.Date;
import javax.persistence.MappedSuperclass;


import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

/** un normale acquirente di films per la casa */
//@Entity
//@Table(name = "customer")//persona
@MappedSuperclass
@Data
@SuppressWarnings("unused")
public class Customer extends Generic {

	
	@Autowired
	private String cf;
	@Autowired
	private String nome;
	@Autowired
	private String cognome;
	@Autowired
	private Date annoNascita;
	@Autowired
	private String nazionalita;


}
