package prodotti;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Entity
@Table(name = "film")
@Data
@SuppressWarnings("unused")
public class Film extends Generic{
	
	@Autowired
	private String titolo;
	@Autowired
	private Date dataUscita;
	@Autowired
	private String nazionalita;
	@Autowired
	private String regista;
	@Autowired
	private String genere;
	@Autowired
	private double durata;
	
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<Attori> attori;


}
