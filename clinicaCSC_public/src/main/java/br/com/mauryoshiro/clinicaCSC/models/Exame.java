package br.com.mauryoshiro.clinicaCSC.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Exame {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExame;

	@OneToOne
	private Agendamento agenda;

	private String objetivoExame;

	// @OneToMany
	// private Collection<ExameConclusao> conclusoes;

	private String conclusaoExame;

	private Boolean concluidoExame;

	private Boolean canceladoExame;

	@OneToMany
	private Collection<TesteRealizado> testesRealizados;

	private String nomeExame;

	public Long getIdExame() {
		return idExame;
	}

	public void setIdExame(Long idExame) {
		this.idExame = idExame;
	}

	public Agendamento getAgenda() {
		return agenda;
	}

	public void setAgenda(Agendamento agenda) {
		this.agenda = agenda;
	}

	public String getObjetivoExame() {
		return objetivoExame;
	}

	public void setObjetivoExame(String objetivoExame) {
		this.objetivoExame = objetivoExame;
	}

	public String getConclusaoExame() {
		return conclusaoExame;
	}

	public void setConclusaoExame(String conclusaoExame) {
		this.conclusaoExame = conclusaoExame;
	}

	public Boolean getConcluidoExame() {
		return concluidoExame;
	}

	public void setConcluidoExame(Boolean concluidoExame) {
		this.concluidoExame = concluidoExame;
	}

	public Boolean getCanceladoExame() {
		return canceladoExame;
	}

	public void setCanceladoExame(Boolean canceladoExame) {
		this.canceladoExame = canceladoExame;
	}

	public Collection<TesteRealizado> getTestesRealizados() {
		return testesRealizados;
	}

	public void setTestesRealizados(Collection<TesteRealizado> testesRealizados) {
		this.testesRealizados = testesRealizados;
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}

	public Exame(Long idExame, Agendamento agenda, String objetivoExame, String conclusaoExame, Boolean concluidoExame,
			Boolean canceladoExame, Collection<TesteRealizado> testesRealizados, String nomeExame) {
		this.idExame = idExame;
		this.agenda = agenda;
		this.objetivoExame = objetivoExame;
		this.conclusaoExame = conclusaoExame;
		this.concluidoExame = concluidoExame;
		this.canceladoExame = canceladoExame;
		this.testesRealizados = testesRealizados;
		this.nomeExame = nomeExame;
	}

	public Exame() {
	}

	/*
	 * public Collection<ExameConclusao> getConclusoes() { return conclusoes; }
	 * 
	 * public void setConclusoes(Collection<ExameConclusao> conclusoes) {
	 * this.conclusoes = conclusoes; }
	 */

}
