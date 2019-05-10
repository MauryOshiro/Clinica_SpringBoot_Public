package br.com.mauryoshiro.clinicaCSC.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cheque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCheque;

	// private LancamentoDespesa lancamentoDespesa;

	@OneToOne
	private Lancamento lancamento;

	private LocalDate dataBaixaCheque;

	private Boolean baixadoCheque;

	private Boolean sustadoCheque;

	private Integer numeroCheque;

	public Long getIdCheque() {
		return idCheque;
	}

	public void setIdCheque(Long idCheque) {
		this.idCheque = idCheque;
	}

	public Lancamento getLancamento() {
		return lancamento;
	}

	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}

	public LocalDate getDataBaixaCheque() {
		return dataBaixaCheque;
	}

	public void setDataBaixaCheque(LocalDate dataBaixaCheque) {
		this.dataBaixaCheque = dataBaixaCheque;
	}

	public Boolean getBaixadoCheque() {
		return baixadoCheque;
	}

	public void setBaixadoCheque(Boolean baixadoCheque) {
		this.baixadoCheque = baixadoCheque;
	}

	public Boolean getSustadoCheque() {
		return sustadoCheque;
	}

	public void setSustadoCheque(Boolean sustadoCheque) {
		this.sustadoCheque = sustadoCheque;
	}

	public Integer getNumeroCheque() {
		return numeroCheque;
	}

	public void setNumeroCheque(Integer numeroCheque) {
		this.numeroCheque = numeroCheque;
	}

	public Cheque(Long idCheque, Lancamento lancamento, LocalDate dataBaixaCheque, Boolean baixadoCheque,
			Boolean sustadoCheque, Integer numeroCheque) {
		this.idCheque = idCheque;
		this.lancamento = lancamento;
		this.dataBaixaCheque = dataBaixaCheque;
		this.baixadoCheque = baixadoCheque;
		this.sustadoCheque = sustadoCheque;
		this.numeroCheque = numeroCheque;
	}

	public Cheque() {
	}

}
