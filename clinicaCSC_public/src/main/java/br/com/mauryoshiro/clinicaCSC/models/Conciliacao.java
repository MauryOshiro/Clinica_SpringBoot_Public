package br.com.mauryoshiro.clinicaCSC.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Conciliacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConciliacao;

	@OneToOne
	private Portador portador;

	private LocalDate dataConciliacao;

	private Double saldoDisponivelDataConciliacao;

	private Double saldoBrutoDataConciliacao;

	private Boolean ativoConciliacao;

	public Long getIdConciliacao() {
		return idConciliacao;
	}

	public void setIdConciliacao(Long idConciliacao) {
		this.idConciliacao = idConciliacao;
	}

	public Portador getPortador() {
		return portador;
	}

	public void setPortador(Portador portador) {
		this.portador = portador;
	}

	public LocalDate getDataConciliacao() {
		return dataConciliacao;
	}

	public void setDataConciliacao(LocalDate dataConciliacao) {
		this.dataConciliacao = dataConciliacao;
	}

	public Double getSaldoDisponivelDataConciliacao() {
		return saldoDisponivelDataConciliacao;
	}

	public void setSaldoDisponivelDataConciliacao(Double saldoDisponivelDataConciliacao) {
		this.saldoDisponivelDataConciliacao = saldoDisponivelDataConciliacao;
	}

	public Double getSaldoBrutoDataConciliacao() {
		return saldoBrutoDataConciliacao;
	}

	public void setSaldoBrutoDataConciliacao(Double saldoBrutoDataConciliacao) {
		this.saldoBrutoDataConciliacao = saldoBrutoDataConciliacao;
	}

	public Boolean getAtivoConciliacao() {
		return ativoConciliacao;
	}

	public void setAtivoConciliacao(Boolean ativoConciliacao) {
		this.ativoConciliacao = ativoConciliacao;
	}

	public Conciliacao(Long idConciliacao, Portador portador, LocalDate dataConciliacao,
			Double saldoDisponivelDataConciliacao, Double saldoBrutoDataConciliacao, Boolean ativoConciliacao) {
		this.idConciliacao = idConciliacao;
		this.portador = portador;
		this.dataConciliacao = dataConciliacao;
		this.saldoDisponivelDataConciliacao = saldoDisponivelDataConciliacao;
		this.saldoBrutoDataConciliacao = saldoBrutoDataConciliacao;
		this.ativoConciliacao = ativoConciliacao;
	}

	public Conciliacao() {
	}

}
