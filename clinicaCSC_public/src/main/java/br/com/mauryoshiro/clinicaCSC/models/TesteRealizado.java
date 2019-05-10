package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TesteRealizado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTesteRealizado;

	@ManyToOne
	private Teste teste;

	private String resultadoTesteRealizado;

	private String observacaoTesteRealizado;

	private Boolean canceladoTesteRealizado;

	public Long getIdTesteRealizado() {
		return idTesteRealizado;
	}

	public void setIdTesteRealizado(Long idTesteRealizado) {
		this.idTesteRealizado = idTesteRealizado;
	}

	public Teste getTeste() {
		return teste;
	}

	public void setTeste(Teste teste) {
		this.teste = teste;
	}

	public String getResultadoTesteRealizado() {
		return resultadoTesteRealizado;
	}

	public void setResultadoTesteRealizado(String resultadoTesteRealizado) {
		this.resultadoTesteRealizado = resultadoTesteRealizado;
	}

	public String getObservacaoTesteRealizado() {
		return observacaoTesteRealizado;
	}

	public void setObservacaoTesteRealizado(String observacaoTesteRealizado) {
		this.observacaoTesteRealizado = observacaoTesteRealizado;
	}

	public Boolean getCanceladoTesteRealizado() {
		return canceladoTesteRealizado;
	}

	public void setCanceladoTesteRealizado(Boolean canceladoTesteRealizado) {
		this.canceladoTesteRealizado = canceladoTesteRealizado;
	}

	public TesteRealizado(Long idTesteRealizado, Teste teste, String resultadoTesteRealizado,
			String observacaoTesteRealizado, Boolean canceladoTesteRealizado) {
		this.idTesteRealizado = idTesteRealizado;
		this.teste = teste;
		this.resultadoTesteRealizado = resultadoTesteRealizado;
		this.observacaoTesteRealizado = observacaoTesteRealizado;
		this.canceladoTesteRealizado = canceladoTesteRealizado;
	}

	public TesteRealizado() {
	}

}
