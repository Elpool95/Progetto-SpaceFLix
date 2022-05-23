package prodotti;

import java.sql.Date;
import javax.persistence.MappedSuperclass;


import org.springframework.beans.factory.annotation.Autowired;

/** un normale acquirente di films per la casa */
//@Entity
//@Table(name = "customer")//persona
@MappedSuperclass
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

	public Customer() {

	}

	@Override
	public String toString() {
		return "Customer [cf=" + cf + ", nome=" + nome + ", cognome=" + cognome + ", annoNascita=" + annoNascita
				+ ", nazionalita=" + nazionalita + "]";
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getAnnoNascita() {
		return annoNascita;
	}

	public void setAnnoNascita(Date annoNascita) {
		this.annoNascita = annoNascita;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}

}
