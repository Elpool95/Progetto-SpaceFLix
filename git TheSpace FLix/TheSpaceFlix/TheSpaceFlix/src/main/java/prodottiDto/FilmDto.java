package prodottiDto;

import java.sql.Date;

import lombok.Data;

@SuppressWarnings("unused")
@Data
public class FilmDto {

	private String titolo;
	private Date dataUscita;
	private String nazionalita;
	private String regista;
	private String genere;
	private double durata;

}
