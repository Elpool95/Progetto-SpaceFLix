package prodotti;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name ="attori")
public class Attori extends Customer{
	
	
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)//eager tira su tutto alternativamente si mette lazy e scegliere noi tramite join 
//	@JoinColumn(name = "codFilm")
	private List<Film> film;
	

	
	public Attori() {
		
	}
	

}
