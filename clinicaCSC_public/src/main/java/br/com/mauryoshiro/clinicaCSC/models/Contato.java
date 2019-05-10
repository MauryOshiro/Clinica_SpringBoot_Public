package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContato;

	private Integer dddTelefoneContato;

	private Integer telefoneContato;

	private Integer dddCelularContato;

	private Integer celularContato;

	private String emailContato;

	/*
	 * public Contato(Integer dddTP, Integer tP, Integer dddTS, Integer tS, Integer
	 * dddCP, Integer cP, Integer dddCS, Integer cS, String email, Integer id) {
	 * this.dddTelefonePrincipal = dddTP; this.telefonePrincipal = tP;
	 * this.dddTelefoneSecundario = dddTS; this.telefoneSecundario = tS;
	 * this.dddCelularPrincipal = dddCP; this.celularPrincipal = cP;
	 * this.dddCelularSecundario = dddCS; this.celularSecundario = cS; this.email =
	 * email; this.id = id; }
	 */

	public Contato() {
	}

	public Contato(Long idContato, Integer dddTelefoneContato, Integer telefoneContato, Integer dddCelularContato,
			Integer celularContato, String emailContato) {
		this.idContato = idContato;
		this.dddTelefoneContato = dddTelefoneContato;
		this.telefoneContato = telefoneContato;
		this.dddCelularContato = dddCelularContato;
		this.celularContato = celularContato;
		this.emailContato = emailContato;
	}

	public Long getIdContato() {
		return idContato;
	}

	public void setIdContato(Long idContato) {
		this.idContato = idContato;
	}

	public Integer getDddTelefoneContato() {
		return dddTelefoneContato;
	}

	public void setDddTelefoneContato(Integer dddTelefoneContato) {
		this.dddTelefoneContato = dddTelefoneContato;
	}

	public Integer getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(Integer telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	public Integer getDddCelularContato() {
		return dddCelularContato;
	}

	public void setDddCelularContato(Integer dddCelularContato) {
		this.dddCelularContato = dddCelularContato;
	}

	public Integer getCelularContato() {
		return celularContato;
	}

	public void setCelularContato(Integer celularContato) {
		this.celularContato = celularContato;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public static Integer converteDDDParaInteger(String t) {
		Integer ddd = Integer.valueOf(t.substring(1, 3));
		return ddd;
	}

	public static Integer converteTelefoneParaInteger(String t) {
		String telefoneString = t.substring(5, 9);
		telefoneString = telefoneString.concat(t.substring(10, 14));
		Integer telefone = Integer.valueOf(telefoneString);
		return telefone;
	}

	public static Integer converteCelularParaInteger(String c) {
		String celularString = c.substring(5, 10);
		celularString = celularString.concat(c.substring(11, 15));
		Integer celular = Integer.valueOf(celularString);
		return celular;
	}

}
