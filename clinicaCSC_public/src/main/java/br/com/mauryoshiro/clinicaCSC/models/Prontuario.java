package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prontuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProntuario;

	private String prontuario;

	public Long getIdProntuario() {
		return idProntuario;
	}

	public void setIdProntuario(Long idProntuario) {
		this.idProntuario = idProntuario;
	}

	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

	public Prontuario(Long idProntuario, String prontuario) {
		this.idProntuario = idProntuario;
		this.prontuario = prontuario;
	}

	public Prontuario() {
	}

}
