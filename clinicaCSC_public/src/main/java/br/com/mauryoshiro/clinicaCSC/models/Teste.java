package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teste {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTeste;

	private String descricaoTeste;

	private String finalidadeTeste;

	private String observacaoTeste;

	private Boolean habilitadoTeste;

	public Long getIdTeste() {
		return idTeste;
	}

	public void setIdTeste(Long idTeste) {
		this.idTeste = idTeste;
	}

	public String getDescricaoTeste() {
		return descricaoTeste;
	}

	public void setDescricaoTeste(String descricaoTeste) {
		this.descricaoTeste = descricaoTeste;
	}

	public String getFinalidadeTeste() {
		return finalidadeTeste;
	}

	public void setFinalidadeTeste(String finalidadeTeste) {
		this.finalidadeTeste = finalidadeTeste;
	}

	public String getObservacaoTeste() {
		return observacaoTeste;
	}

	public void setObservacaoTeste(String observacaoTeste) {
		this.observacaoTeste = observacaoTeste;
	}

	public Boolean getHabilitadoTeste() {
		return habilitadoTeste;
	}

	public void setHabilitadoTeste(Boolean habilitadoTeste) {
		this.habilitadoTeste = habilitadoTeste;
	}

	public Teste(Long idTeste, String descricaoTeste, String finalidadeTeste, String observacaoTeste,
			Boolean habilitadoTeste) {
		this.idTeste = idTeste;
		this.descricaoTeste = descricaoTeste;
		this.finalidadeTeste = finalidadeTeste;
		this.observacaoTeste = observacaoTeste;
		this.habilitadoTeste = habilitadoTeste;
	}

	public Teste() {
	}

}
