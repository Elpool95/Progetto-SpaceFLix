package prodotti;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "film")
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

	public Film() {
	}




	@Override
	public String toString() {
		return "Film [titolo=" + titolo + ", annoProduzione=" + dataUscita + ", nazionalita=" + nazionalita
				+ ", regista=" + regista + ", genere=" + genere + ", durata=" + durata + "]";
	}




	public List<Attori> getAttori() {
		return attori;
	}

	public void setAttori(List<Attori> attori) {
		this.attori = attori;
	}




	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Date getAnnoProduzione() {
		return dataUscita;
	}

	public void setAnnoProduzione(Date annoProduzione) {
		this.dataUscita = annoProduzione;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public double getDurata() {
		return durata;
	}

	public void setDurata(double durata) {
		this.durata = durata;
	}

}
