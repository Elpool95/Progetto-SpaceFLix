package prodottiDto;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;


@Data
@SuppressWarnings("unused")
public class CustomerDto {
	

	private String cf;
	private String nome;
	private String cognome;
	private Date annoNascita;
	private String nazionalita;

}
